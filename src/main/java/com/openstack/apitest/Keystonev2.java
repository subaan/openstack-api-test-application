/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.openstack.apitest;

import com.az.openstack.OpenStackServer;
import java.util.ArrayList;
import java.util.List;
import org.openstack4j.api.Builders;
import org.openstack4j.api.OSClient;
import org.openstack4j.model.compute.Server;
import org.openstack4j.model.compute.ServerCreate;
import org.openstack4j.model.network.IPVersionType;
import org.openstack4j.model.network.Network;
import org.openstack4j.model.network.Subnet;
import org.openstack4j.model.storage.block.Volume;

/**
 *
 * @author Abdul
 */
public class Keystonev2 {
    
    public static void main(String[] args) {
        
        OpenStackServer server = new OpenStackServer("http://192.168.1.181:5000/v2.0", "admin", "1483ffaf6a0a4189", null, "admin");
            OSClient os = server.authenticate();
        
        
        //Create account v2
//            Tenant tenant = os.identity().tenants().create(Builders.tenant().name("balaji").enabled(true).build());
//            
//            System.out.println("tenant: "+tenant);
//                        Tenant tenant1 = os.identity().tenants().get("16050ec645b34b8992e5273f1336491c");
//            Tenant tenant = os.identity().tenants().update(Builders.tenant().id("16050ec645b34b8992e5273f1336491c").name("abc2").build());
//            System.out.println("tenant:"+tenant);
            
//            ActionResponse actionResponse = os.identity().tenants().delete("16050ec645b34b8992e5273f1336491c");
//            
//            System.out.println("actionResponse: "+actionResponse);
            

//            System.out.println("user creation: "+os.identity().users().create("29070f99478840f4980e296f6203e8f4", "abdul", "password", "abc@gmail.com", true));
//            System.out.println("user creation: "+os.identity().roles().addUserRole("aa75449cdeea455ca1b3c61868acd40f", "9fe2ff9ee4384b1894a90878d3e92bab"));
//               System.out.println("role list: "+os.identity().roles().addUserRole("29070f99478840f4980e296f6203e8f4", "8bcd091da7194b2d926b4a0aed627607", "a1d5e6411bb044bf9681952d2d1ab220"));
//            System.out.println("service cat: "+os.getAccess().getServiceCatalog());
// 
//            List<? extends Service> services = os.getAccess().getServiceCatalog();
//            
//            for(Service service: services) {
//                System.out.println(""+service.getEndpoints());
//                
//                for(Endpoint endPoint: service.getEndpoints()) {
//                    System.out.println("region: "+endPoint.getRegion());
//                }
////                System.out.println(""+service.getEndpoints());
////                System.out.println(""+service.getServiceType());
////                System.out.println(""+service.getName());
//            }
//            HttpConnector userAPIConnector = new HttpConnector();
//            System.out.println("flav list: "+os.compute().flavors().list());
//            
//            String data = "{\"user\": {\"password\": \"abdul\"}}";
//                    
//                String response = userAPIConnector.simplePut(new URL("http://192.168.1.181:5000/v2.0/users/aa75449cdeea455ca1b3c61868acd40f"), data, os.getToken().getId());
//            System.out.println("response: "+response);
            
            //Reset password
//            System.out.println("response: "+os.identity().users().update(Builders.user().tenantId("29070f99478840f4980e296f6203e8f4")
//                    .id("aa75449cdeea455ca1b3c61868acd40f")
//                    .password("abdul1")
//                    .enabled(true)
//                    .build()));
            //zone list
//            List<? extends AvailabilityZone> availabilityzones =  os.compute().zones().list(true);
//            
//            for (AvailabilityZone availabilityzone : availabilityzones) {
//                System.out.println("ZONE NAME: "+availabilityzone.getZoneName());
//            }
//            System.out.println("list: "+os.compute().zones().list());
            
            //Role
            
//            System.out.println("role"+os.identity().roles().addUserRoleByTenant("9713fdafee0a441ea4792e47483e05c0", "aa75449cdeea455ca1b3c61868acd40f", "9fe2ff9ee4384b1894a90878d3e92bab"));;
            
//            System.out.println("list: "+os.identity().roles().getName("_member_"));
            
            //Resources
            //Flavor create
            System.out.println("flavor: "+os.compute().flavors()
                            .create(Builders.flavor()
                            .name("test")
                            .ram(512)
                            .vcpus(1)
                            .disk(1)
                            .swap(0)
                            .ephemeral(0)
                            .isPublic(true)
                            .build()));
            
            //Flavor delete
            System.out.println(""+os.compute().flavors().delete("73b32c83-864a-403a-a5e8-7752f58ff81c"));
            
            //network
            Network openstackNetwork = os.networking().network()
            .create(Builders.network().tenantId("9713fdafee0a441ea4792e47483e05c0").name("test").adminStateUp(true).isShared(false).build());

            Subnet subnet = os.networking().subnet().create(Builders.subnet()
                .name("test")
                .network(openstackNetwork)
                .ipVersion(IPVersionType.V4)
                .cidr("192.168.2.3/24")
                .enableDHCP(true)
                
                .build());
            
            Network network = os.networking().network().update("f7f37692-d8d9-4723-8b66-65e0058a9bfe", Builders.networkUpdate().name("test1").build());
            System.out.println("network: "+network);
            
            
            System.out.println(""+os.networking().network().delete("f7f37692-d8d9-4723-8b66-65e0058a9bfe"));
            
            //volumetype
            System.out.println(""+os.blockStorage().volumes().createVolumeType("test2"));
            
            //volume
            
            Volume volume = os.blockStorage().volumes()
                .create(Builders.volume()
                    .name("test")
                    .description("test")
                    .size(1)

                    .bootable(true)
                    .build());
            
            System.out.println("volume: "+volume);
            
             System.out.println("volume: "+os.blockStorage().volumes()
                .update("4aee4da9-d766-4a6e-8873-4a4a17f9898e", "test","test123"));
             
             System.out.println("volume: "+os.blockStorage().volumes()
                .delete("4aee4da9-d766-4a6e-8873-4a4a17f9898e"));
             
             //keypair
             System.out.println(""+os.compute().keypairs().create("test", null));
             
             //vm creation
             List<String> networkList = new ArrayList<String>();
             List<String> securityGroupList = new ArrayList<String>();
             networkList.add("6fca325d-1207-4a75-9b53-8f74628f8ef5");
            securityGroupList.add("test");
  
            ServerCreate sc = Builders.server().name("test-Vm2").flavor("1")
                                .image("11cd870e-4287-43ab-a50f-1b0af7fb24c6")
                    
                                .networks(networkList)
                                .keypairName("test")
                                .securityGroups(securityGroupList)
                                .availabilityZone("nova")
                                .build();
            Server vm = os.compute().servers().boot(sc);
////            
            System.out.println("vm: "+vm);
            
            System.out.println("vm: "+os.compute().servers().get("83cfe231-af65-454b-ac3f-2013203fd00f").getName());
//            
//            def listProjcetId = new ArrayList<String>()
//            def listUserId = new ArrayList<String>()
            
//            List<? extends Tenant> tenants = os.identity().tenants().list();
//                
//                for(Tenant tenant : tenants) {
//                    if(tenant.getName().equals("services")) {
//                        listProjcetId.add(tenant.getId());
//                    } else if (tenant.getName().equals("demo")){
//                        listProjcetId.add(tenant.getId());                    
//                    } else if (tenant.getName().equals("admin")){
//                        listProjcetId.add(tenant.getId());                    
//                    } 
//                }
//                
//                for (int i = 0; i < listProjcetId.size(); i++) {
//                    
//                    List<? extends OSUser> osUsers =  os.identity().users().listTenantUsers(listProjcetId.get(i));
//                    
//                    for(OSUser user: osUsers) {
//                        listUserId.add(user.getId());
//                    }
//                    
//                }
//                
//                for(OSUser openStackUser : users) {
//                    
//                    if(!listUserId.contains(openStackUser.getId()) && openStackUser.getId() != null) {
//                        this.addUser(openStackUser, openStackVersion, dbUser, os);
//                    }
//                }
            
            
            
    }
    
    
    
}
