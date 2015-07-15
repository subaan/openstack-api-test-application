/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.openstack.apitest;

import com.az.openstack.OpenStackServer;
import com.google.gson.Gson;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.rmi.UnexpectedException;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openstack4j.api.Builders;
import org.openstack4j.api.OSClient;
import org.openstack4j.api.exceptions.AuthenticationException;
import org.openstack4j.api.types.Facing;
import org.openstack4j.model.common.DLPayload;
import org.openstack4j.model.common.Payload;
import org.openstack4j.model.common.Payloads;
import org.openstack4j.model.compute.ActionResponse;
import org.openstack4j.model.compute.Keypair;
import org.openstack4j.model.compute.Server;
import org.openstack4j.model.compute.ServerCreate;
import org.openstack4j.model.compute.ext.AvailabilityZone;
import org.openstack4j.model.compute.ext.HypervisorStatistics;
import org.openstack4j.model.identity.Access.Service;
import org.openstack4j.model.identity.Endpoint;
import org.openstack4j.model.identity.Role;
import org.openstack4j.model.identity.Tenant;
import org.openstack4j.model.identity.User;
import org.openstack4j.model.identity.v3.Catalog;
import org.openstack4j.model.identity.v3.EndpointV3;
import org.openstack4j.model.identity.v3.Project;
import org.openstack4j.model.image.DiskFormat;
import org.openstack4j.model.image.Image;
import org.openstack4j.model.network.IPVersionType;
import org.openstack4j.model.network.Network;
import org.openstack4j.model.network.SecurityGroup;
import org.openstack4j.model.network.SecurityGroupRule;
import org.openstack4j.model.network.Subnet;
import org.openstack4j.model.storage.block.Volume;
import org.openstack4j.model.storage.block.VolumeSnapshot;
import org.openstack4j.model.storage.block.options.DownloadOptions;
import org.openstack4j.model.storage.object.SwiftContainer;
import org.openstack4j.model.storage.object.SwiftObject;
import org.openstack4j.model.storage.object.options.ObjectLocation;
import org.openstack4j.model.telemetry.SampleCriteria;
import org.openstack4j.model.telemetry.Statistics;
import org.openstack4j.openstack.identity.domain.v3.KeystoneTokenV3;
//import org.openstack4j.model.storage.block.VolumeAttachment;

/**
 *
 * @author gowtham
 */
public class OpenstackTest {

    public static void main(String[] args) {

        try {

//            DefaultEndpointURLResolver.java - endpoint change based on region
//            OpenStackServer server = new OpenStackServer("http://68.233.240.158:3000/v3", "16b5c6165a3541e19f604af356805723", "8bfec7d5baf84739", null);
//            OSClient os = server.authenticate();
//            OpenStackServer server = new OpenStackServer("http://68.233.240.159:5000/v3", "7a41b609a7894295b9ab4a087a187645", "abdul123", null);
//            OSClient os = server.authenticate();
//            OpenStackServer server = new OpenStackServer("http://162.252.80.100:3000/v3", "cfad619a512e47279c1b665d72290e59", "password", "Default", null);
//            OSClient os = server.authenticate();
            //admin
//            OpenStackServer server = new OpenStackServer("http://162.252.80.100:3000/v3", "12725cd8cd144037bf755d7db4eab278", "b4226fea6b394047", "default", "admin");
//            OSClient os = server.authenticate();
//            OpenStackServer server = new OpenStackServer("http://162.252.80.100:3000/v3", "2cee7c6a0c0d422aad1bf3ae6783315e", "password", "default", "project-haji");
//            OSClient os = server.authenticate();
//            
//            OpenStackServer server = new OpenStackServer("http://68.233.240.159:5000/v3", "bb7fbeb7ea764b66a8e6e8e611d04d12", "l3tm3in!@#123", null);
//            OSClient os = server.authenticate();
//            OpenStackServer server = new OpenStackServer("http://68.233.240.159:5000/v3", "cd8effcebd8c423fb3ea40ee45236c48", "NANDHINI", null);
//            OSClient os = server.authenticate();
//            OpenStackServer server = new OpenStackServer("http://68.233.240.158:5000/v3", "36052a9e41e240d0b935837ce57b328b", "balaji123", null);  
//            OSClient os = server.authenticate();
//             OpenStackServer server = new OpenStackServer("http://192.168.1.224:5000/v3", "b10aeac59d5f4c999809fbe82e291c8c", "2ea7b53474524227", null);  
//            OSClient os = server.authenticate();
//            OpenStackServer server = new OpenStackServer("http://192.168.1.224:5000/v3", "a693970e2f3d4ada96623e987ee33c43", "password", null);
//            OSClient os = server.authenticate();
//            OpenStackServer server = new OpenStackServer("http://192.168.1.195:5000/v3", "057928057ae84c00afa70478844bad24", "8acd1d1e32164ca5", "default", "admin");
//            OSClient os = server.authenticate();
//            OpenStackServer server = new OpenStackServer("http://10.10.1.105:5000/v3", "c0d6bf8eeffb4b519486d17f8c5c3b84", "admin@123", "default", "admin");
//            OSClient os = server.authenticate();
//            OpenStackServer server = new OpenStackServer("http://192.168.1.195:5000/v3", "4ce1b30ee75b47f1979e6da8c742c420", "password", null);
//            OSClient os = server.authenticate();
//            OpenStackServer server = new OpenStackServer("http://192.168.1.181:5000/v3", "a7718e9bed0b42fb8f42c8bcbb5867de", "241b0e1263284ec6", null);
//            OSClient os = server.authenticate();
//            OpenStackServer server = new OpenStackServer("http://192.168.1.181:5000/v3", "69cbea16a1fd4056a980a09ffebe4f6e", "password", null);
//            OSClient os = server.authenticate();
//            OpenStackServer server = new OpenStackServer("http://68.233.240.157:5000/v3", "2c546ced45614908942021d6b5030607", "834a9384676345d2", "default", "admin");
//            OSClient os = server.authenticate();
//            OpenStackServer server = new OpenStackServer("http://192.168.1.180:5000/v2.0", "admin", "afe0eab67af94700", null, "admin");
//            OSClient os = server.authenticate();
            OpenStackServer server = new OpenStackServer("http://192.168.1.181:5000/v2.0", "admin", "1483ffaf6a0a4189", null, "admin");
            OSClient os = server.authenticate();
//            OpenStackServer server = new OpenStackServer("http://68.233.240.157:5000/v3", "2c546ced45614908942021d6b5030607", "834a9384676345d2","default", "admin");
//            OSClient os = server.authenticate();
//            OpenStackServer server = new OpenStackServer("http://68.233.240.157:5000/v3", "90fd2e5cebf6499e8b23516a0864be72", "password", "default", "fog_auth");
//            OSClient os = server.authenticate();
//            OpenStackServer server = new OpenStackServer("http://68.233.240.159:5000/v3", "bb7fbeb7ea764b66a8e6e8e611d04d12", "admin_!@#", "default", "admin");
//            OSClient os = server.authenticate();
//            OpenStackServer server = new OpenStackServer("http://68.233.240.159:5000/v3", "1bcd87c3164e48d095b6517d93a36c85", "password", "default", "fog_auth");
//            OSClient os = server.authenticate();
//            OpenStackServer server =  new OpenStackServer(null, null, null, null, null);
//            OSClient os = server.authenticate();
//            os.networking().securitygroup().delete("36cf6213-12f0-4df5-99fa-66a0fdf8f7b4");
//            os.networking().securitygroup().create(Builders.securityGroup().name("security_fog_Gowtham1").description("desc").build()); 

//             Image image = os.images().update(Builders.image().id("2f26bde0-8e5b-4011-af8e-402d49bfd60b").name("balaji_test").isPublic(true)
//                .isProtected(true)
//                .minRam(Long.valueOf("128"))
//                .minDisk(Long.valueOf("1"))
//                .build());
//            os.useRegion("RegionOne");
//            System.out.println("os: " + os.identity().tenants().list().iterator().next().getId());
//            System.out.println(""+os.identity().users().listUserTenants("8bcd091da7194b2d926b4a0aed627607"));
//             List<? extends User> users = os.identity().users().list();    
//             
//             System.out.println("users: "+users);
            System.out.println("os: " + os.compute().hypervisors().statistics());

  
//           User user =  os.identity().users().get("70595f1303a14a8988b0894e45d0a656");
//            System.out.println("ten: "+user.getTenantId());
//            List<String> listUserId = new ArrayList<String>();
//             
//             System.out.println(""+os.identity().projects().list());
//             
//             List<String> listProjcetId = new ArrayList<String>();
//             
//             List<? extends Tenant> tenants = os.identity().tenants().list();
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
//                System.out.println("listProjcetId: "+listProjcetId);
//                for (int i = 0; i < listProjcetId.size(); i++) {
//                    
//                    List<? extends User> users =  os.identity().users().listTenantUsers(listProjcetId.get(i));
//                    
//                    for(User user: users) {
//                        listUserId.add(user.getId());
//                    }
//            }
//                
//                List<? extends User> userss = os.identity().users().list();
//                
//                for(User user: userss) {
//                    if(! listUserId.contains(user.getId()) && user.getId() != null) {
//                        System.out.println("user: "+user.getName());
//                    }
//                }
//            System.out.println(""+os.identity().users().listTenantUsers("9713fdafee0a441ea4792e47483e05c0"));
//                System.out.println("listUserId: "+os.identity().users().listUserTenants("aa75449cdeea455ca1b3c61868acd40f"));
//             for(User user : users) {
//                 System.out.println("proj id: "+user.getTenantId());
//             }
//            
//            List<? extends Tenant> tenants = os.identity().tenants().list();
//            
//            for(Tenant tenant : tenants) {
//                
//                
//            }
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
//            System.out.println(""+os.compute().floatingIps().allocateIP("public"));
            //Role
//            System.out.println("role"+os.identity().roles().addUserRoleByTenant("9713fdafee0a441ea4792e47483e05c0", "aa75449cdeea455ca1b3c61868acd40f", "9fe2ff9ee4384b1894a90878d3e92bab"));;
//            System.out.println("list: "+os.identity().roles().getName("_member_"));
            //Resources
//            System.out.println(""+os.blockStorage().volumes().deleteVolumeType("b75277cd-9658-4c5d-b172-15594dc1ede2"));
//            SecurityGroup group = os.networking().securitygroup().create(Builders.securityGroup().name("test").description("test").build());     
//            
//            System.out.println(""+os.compute().keypairs().delete("test"));
//            HypervisorStatistics hypervisorStatistics = os.compute().hypervisors().statistics();
////            
////          
////            
////            List<? extends Statistics> stats = os.telemetry().meters().statistics("network", SampleCriteria.create().resource("9cb52d59-928c-4fa9-82a7-e7ba6761a4f2").add("end", SampleCriteria.Oper.EQUALS, "2015-06-19T04:26:39").add("start", SampleCriteria.Oper.EQUALS, "2015-05-26T03:19:55"));
//            
//            System.out.println("statistics: "+hypervisorStatistics);
//            System.out.println("statistics: "+hypervisorStatistics.getCount());
//            System.out.println("statistics: "+hypervisorStatistics.getCurrentWorkload());
//            System.out.println("statistics: "+hypervisorStatistics.getFreeDisk());
//            System.out.println("statistics: "+hypervisorStatistics.getFreeRam());
//            System.out.println("statistics: "+hypervisorStatistics.getLeastAvailableDisk());
//            System.out.println("statistics: "+hypervisorStatistics.getLocal());
//            System.out.println("statistics: "+hypervisorStatistics.getLocalUsed());
//            System.out.println("statistics: "+hypervisorStatistics.getMemory());
//            System.out.println("statistics: "+hypervisorStatistics.getMemoryUsed());
//            System.out.println("statistics: "+hypervisorStatistics.getRunningVM());
//            System.out.println("statistics: "+hypervisorStatistics.getVirtualCPU());
//            System.out.println("statistics: "+hypervisorStatistics.getVirtualUsedCPU());
//           List<? extends AvailabilityZone> availabilityzones =  os.compute().zones().list(true);
//             
//            System.out.println("list: "+availabilityzones.isEmpty());
//             
//            List<? extends Image> images = null;
//            List<? extends Image> imageList = os.images().list();
//            
//            for(Image openstackImage : imageList) {
//                if(openstackImage.isPublic() || openstackImage.isProtected()) {
//                    System.out.println("image: ");
//                }
//            }
//            
//            os.compute().servers().action(null, null);
//            System.out.println("image: "+image.getCreatedAt());
//            Map<String, String> map = image.getProperties();
//                            
//                                for (Map.Entry<String, String> entry : map.entrySet()) {
//                                    System.out.println("key: "+entry.getKey());
//                                    System.out.println("value: "+entry.getValue());
//                                    if(entry.getKey().equals("instance_uuid")) {
//                                        System.out.println("uuid: "+entry.getValue());
//                                    }
//                                    
//                                    if(entry.getKey().equals("user_id")) {
//                                        System.out.println("user_id: "+entry.getValue());
//                                    }
//                                    
//                                }
//            List<? extends Server> servers = os.compute().servers().list();
//   
//            
//            for(Server server1: servers) {
//                System.out.println(""+server1.getUserId());
//                if(server1.getKeyName() != "null" || server1.getKeyName() != null) {
//                    //db sshkey name for current user
//                    
//                }
//                System.out.println(""+server1.getCreated());
//            }
            //security group
//            SecurityGroupRule securityGroupRule = os.networking().securityrule().create(Builders.securityGroupRule().securityGroupId("194bba85-ec0c-4ddc-a8ab-a1e904818a72")
//                    .direction("egress")
//                    .protocol("tcp")
//                    .portRangeMin(3)
//                    .portRangeMax(15)
//                    .remoteIpPrefix("0.0.0.0/0")
//                    .build()); 
//            System.out.println("securityGroupRule: "+securityGroupRule);
//            System.out.println("os: " + os.networking().securitygroup().list());
            //keypair
//            GenerateKeyPair generateKeyPair = new GenerateKeyPair();
//            String generatedPrivateKey = generateKeyPair.getPrivateKey();
//            String generatedPublicKey = generateKeyPair.getPublicKey();
//            Keypair kp = os.compute().keypairs().create("fog_auth_key", generatedPublicKey);
//            List<? extends Keypair> keypairs = os.compute().keypairs().list();
//            for(Keypair keypair: keypairs) {
//                System.out.println("name:" + keypair.getName());
//            }
//            System.out.println("flo ip: "+os.networking().floatingip().create(Builders.netFloatingIP().floatingNetworkId("9cb52d59-928c-4fa9-82a7-e7ba6761a4f2").build()));
//            System.out.println("domain list: " + os.identity().domains().list());
//            System.out.println("domain list: " + os.identity().projects().list());
//              System.out.println("os: "+os.identity().roles().list()); //e4eb11ff62d04c8a89211d0df1975dbb
//              ActionResponse actionResponse = os.identity().roles().addUserRole("908aa30273e5432799714aba21ac1d52", "2cee7c6a0c0d422aad1bf3ae6783315e", "e4eb11ff62d04c8a89211d0df1975dbb");
//              System.out.println("actionResponse: "+os.identity().roles().listRolesForUser("12725cd8cd144037bf755d7db4eab278", "89602ad8cbc148d8a69d09dd0696a769"));
//List<? extends User> users = os.identity().users().list();            
//            for (User openStackUser : users) {
//                openStackUser.getId();
////                openStackUser.
//            }
//              HashMap hashMap =  new HashMap();
//              List<? extends Role>  roles = os.identity().roles().listRolesForUser("cfad619a512e47279c1b665d72290e59", "7677380380844602b51ec8c4369cd27d");
//              for(Role role : roles) {
//                  System.out.println("role: "+role.getName());
//                  System.out.println("role: "+role.getId());
//                  hashMap.put(role.getName(), role.getId());
//              }
//              
//              if(!hashMap.containsKey("SwiftOperator")) {
//                  System.out.println("not swift");
//                  Role currentRole = os.identity().roles().getByName("SwiftOperator"); 
//                  
//                  String roleId = currentRole.getId();
//                  ActionResponse actionResponse = os.identity().roles().addUserRole("7677380380844602b51ec8c4369cd27d","cfad619a512e47279c1b665d72290e59", roleId);
//                  System.out.println("actionResponse: "+actionResponse.toString());
//              }
//            Gson gson = new Gson();
////            OpenStackServer 
//            
//            String json = gson.toJson(server.authenticate());
//            
//            System.out.println("json: "+json);
//           
//            QuotaSet quotaSet = os.compute().quotaSets().get("7f1a2037541a417096914c9dfe613e1f");
//            os.networking().quotas().get();
//            System.out.println("quotaSet :"+quotaSet.toString());
            //endpoint list
//            List<? extends Endpoint> endpoints = os.identity().listTokenEndpoints();
//            System.out.println(""+os.objectStorage().containers().list());
//            os.useRegion("region2");
//            DLPayload dLPayload = os.objectStorage().objects().download(ObjectLocation.create("test-r2", "container image"), DownloadOptions.create());
//            System.out.println("dLPayload: "+dLPayload);
//            os.useRegion("region2");
//            System.out.println("details: "+os.objectStorage().containers().list());
//            System.out.println("details: "+os);
//            os.networking().floatingip().create(Builders.netFloatingIP()
//                .floatingNetworkId("asas")
//                    
//                .build());
//            System.out.println("list: "+os.identity().users().listUserTenants("e3435b972af541328854cd5f3ddacae3"));
//            List<? extends Project> projects = os.identity().users().listUserTenants("e3435b972af541328854cd5f3ddacae3");
//            System.out.println(""+projects.iterator().next());
//            for(Project project: projects) {
//                System.out.println(""+project.getId());
//                System.out.println(""+project.isEnabled());
//            }
//            List<? extends SwiftContainer> swiftContainers = os.objectStorage().containers().list();
//            System.out.println("details: "+swiftContainers);
//            for(SwiftContainer swiftContainer: swiftContainers) {
//                
//                System.out.println("swiftContainer.getMetadata(): "+swiftContainer.getMetadata());
//                Map<String, String> map = swiftContainer.getMetadata();
//                
//            }
//            os.useRegion("region2");
//            SwiftObject swiftObject = os.objectStorage().objects().get("test2", "container%20image");  
//            ActionResponse actionResponse = os.objectStorage().containers().create("test12%20test");
//            System.out.println("value: "+actionResponse);
//            System.out.println("swiftObject: "+swiftObject.getMetadata());
//            
//            Map<String, String> metaData = os.objectStorage().objects().getMetadata("test-r2", "container image");
//            System.out.println("metaData: "+metaData);
            List<String> networkList = new ArrayList<String>();
            List<String> securityGroupList = new ArrayList<String>();
//            os.useRegion("regionOne");
//            System.out.println("list: "+os.compute().servers().list());
//            System.out.println("image List: "+os.networking().network().list());
//            
//            networkList.add("6fca325d-1207-4a75-9b53-8f74628f8ef5");
//            securityGroupList.add("test");
//  
//            ServerCreate sc = Builders.server().name("test-Vm2").flavor("1")
//                                .image("11cd870e-4287-43ab-a50f-1b0af7fb24c6")
//                    
//                                .networks(networkList)
//                                .keypairName("test")
//                                .securityGroups(securityGroupList)
//                                .availabilityZone("nova")
//                                .build();
//            Server vm = os.compute().servers().boot(sc);
////            
//            System.out.println("vm: "+os.compute().servers().get("83cfe231-af65-454b-ac3f-2013203fd00f").getName());
//            Port port = os.networking().port().get("1");
//            InputStream input = null;
//            String type = URLConnection.guessContentTypeFromStream(input);
//            os.useRegion("RegionOne");
//            Payload<URL> payload = Payloads.create(new URL("http://192.168.1.33/CentOS-7.0-1406-x86_64-Minimal.iso"));
//            Payload<URL> payload = Payloads.create(new URL("http://centos.bytenet.in/6.6/isos/x86_64/CentOS-6.6-x86_64-netinstall.iso"));
//            Payload<URL> payload = null;
//            Image openstackImage = os.images().create(Builders.image()
//            .name("centOs-7.0.1")
//            .isPublic(Boolean.FALSE)
//            .diskFormat(DiskFormat.QCOW2)
//            .minDisk(Long.getLong("1"))
//            .minRam(Long.getLong("512"))
//            .build(), payload);
////            
//            System.out.println("openstackImage: "+openstackImage);
//            os.useRegion("region2");
//            List<? extends Network> networks = os.networking().network().list();
//            
//            for(Network network: networks) {
//                System.out.println("name: "+network.getName());
//                System.out.println("name: "+network.isRouterExternal());
//            }
//            Network network = os.networking().network().get("667e69f0-6659-4540-a123-550e85b02703");
//            System.out.println("network: "+network);
//            os.useRegion("RegionOne");
//            System.out.println("test: "+os.blockStorage().volumes().listVolumeTypes());
//            ActionResponse actionResponse  = os.blockStorage().volumes().deleteVolumeType("1eb5a240-1527-4b7b-8239-53973fb40ad7");  
//            
//            System.out.println("actionResponse: "+actionResponse);
//            List<? extends SwiftContainer> swiftContainers = os.objectStorage().containers().list();
//           
//            List<? extends SwiftObject> swiftObjects = os.objectStorage().objects().list("test2");
//            
//            for(SwiftObject swiftObject: swiftObjects) {
//                System.out.println("name: "+swiftObject.getName());
//                System.out.println("name: "+swiftObject.isDirectory());
//            }
//            System.out.println("domains: "+os.identity().domains().list());
//           List<? extends Project> projects = os.identity().projects().list();
//           String serviceId = "";
//           for(Project project : projects) {
//               if(project.getName().equals("services")) {
//                  serviceId = project.getId();
//               }
//           }
//           
//           List<? extends Image> images = os.images().list();
//            System.out.println("images: "+images);
//            System.out.println("user: "+);
//            User user = os.identity().users().get("b10aeac59d5f4c999809fbe82e291c8c");
//            
//            String projectId = user.getTenantId();
//            System.out.println("images: "+images);
//            for(Image image: images) {
//                System.out.println("name: "+image.getName());
//                System.out.println("properties:"+image.getProperties());
//                if(image.getOwner().equals(projectId) || image.getOwner().equals(serviceId)) {
//                    System.out.println("name: "+image.getName());
//                    System.out.println("Owner: "+image.getOwner());
//                }
//            }
//            System.out.println("serviceId"+serviceId);
//            System.out.println("con list: "+os.objectStorage().containers().list());
//            List<? extends Server> vms = os.compute().servers().listAll(true);
//            System.out.println("os:  "+os.networking().floatingip().list());
//            
//            List<? extends Port> ports = os.networking().port().list();
//            
//            for(Port port: ports) {
//                System.out.println("Id: "+port.getDeviceId());
//                System.out.println("N/w id: "+port.getNetworkId());
//                System.out.println("Fixed ips: "+port.getFixedIps());
//                System.out.println("device owner: "+port.getDeviceOwner());
//                
//            }
//           
//            for(Server vm: vms) {
////                System.out.println("host id: "+vm.getHostId());
//                Map<String, List<? extends Address>> address = vm.getAddresses().getAddresses();
////                
////                System.out.println("address: "+address);
////                
//                for(Map.Entry<String, List<? extends Address>> entrySetAdd: address.entrySet()) {
//                    System.out.println("address: "+entrySetAdd.getKey());
//                    System.out.println("address: "+entrySetAdd.getValue());
//                    
//                    for(Address address1 : entrySetAdd.getValue()) {  
//                        if(address1.getType().equals("fixed")) {
//                            for(Port port: ports) {
//                                if(port.getFixedIps().equals(address1.getAddr())) {
//                                    System.out.println("network id"+port.getNetworkId());
//                                }
//                            }
//
//                        }
//                    }
//                    
//                }
//                System.out.println("name: "+vm.getName());
//                System.out.println("Image: "+vm.getImage().getId());
//                System.out.println("flavor: "+vm.getFlavorId());
//                System.out.println("key: "+vm.getKeyName());
//                System.out.println("zone Name: "+vm.getAvailabilityZone());
//                List<String> list = vm.getOsExtendedVolumesAttached();
//                for(String string: list) {
//                    System.out.println("string: "+string);
//                }
//                List<String> strings = vm.getSecurityGroups(); 
//                for(String s: strings) {
//                    System.out.println("securityGroup: "+s);
//                }
//                System.out.println("zone Name: "+);
//            }
//            System.out.println("server list: "+os.compute().servers().listAll(true));
//            ActionResponse actionResponse = os.objectStorage().containers().create("test12");
//            
//            System.out.println("actionResponse: "+actionResponse);
//            List<? extends Volume> volumes = os.blockStorage().volumes().list();
//            
//            System.out.println("volume: "+volumes);
//            
//            for(Volume volume : volumes) {
//                System.out.println("name: "+volume.getName());
//                System.out.println("status: "+volume.getStatus());
//                Status status = Status.ERROR;
//                if(volume.getStatus().equals(Status.ATTACHING)) {
//                    System.out.println("Status is in error");
//                } else {
//                    System.out.println("success");
//                }
//            }
//            List<? extends Project> projects = os.identity().projects().getByName("balaji");
//            List<? extends User> users = os.identity().users().getByName("abdul-fog");
//            QuotaSet computeQuotaSet = os.compute().quotaSets().get("88bba3becd314e1bb93cb3cd0d17288f");
//            
//            System.out.println("computeQuotaSet: "+computeQuotaSet);
//            NetQuota novaQuota = null;
//            
//            CinderQuotaSet cinderQuotaSet;
//           os.compute().servers().confirmResize("3160a535-3a6d-4237-bae3-b600c6df09e5");
//           
//           os.networking().port().list();
//           os.networking().floatingip().associateToPort();
//            
//        Map<String, String> md = os.objectStorage().containers().getMetadata("test3");
//        
//            System.out.println("md: "+md);
//            System.out.println("end: "+os.getAccess().getEndpoint());
//         ServiceManagerService sm = os.identity().services();
//            System.out.println("end: " + os.identity().listEndpoints());
//            KeystoneTokenV3 token = (KeystoneTokenV3) os.getAccess().getToken();
//            URL objectStoreUrl = null;
//            for (Catalog catalog : token.getCatalog()) {
//                System.out.println("type: "+catalog.getType());
//                if(catalog.getType().equals("object-store")) {
//                    for(EndpointV3 endpointV3: catalog.getEndpoints()) {
//                        System.out.println("service: "+endpointV3.toString());
//                        if(endpointV3.getInterface() == Facing.PUBLIC) {
//                             System.out.println("interface: "+endpointV3.getURL());
//                        }
//
//                    }
//                }
//                System.out.println("Interface: " + catalog.getEndpoints().iterator().next().getInterface());
//                System.out.println("end Points: "+catalog.getEndpoints().iterator().next().getURL());
//                if (catalog.getType().equals("image")) {
//                    System.out.println("end Points: " + catalog.getEndpoints().iterator().next().getInterface());
//                    System.out.println("Type: " + catalog.getEndpoints().iterator().next().getURL());
//                    objectStoreUrl = catalog.getEndpoints().iterator().next().getURL();
//
//                }
//            }
//          
//            System.out.println("con list: "+os.objectStorage().containers().list());
//            List<? extends SwiftObject> swiftObjects = os.objectStorage().objects().list("test2", ObjectListOptions.create().path("folder"));
//            
//             for(SwiftObject swiftObject: swiftObjects) {
//                 
//                 System.out.println("objectName: "+swiftObject.getName());
//                 
//             }
//             List<? extends SwiftObject> swiftObjects = os.objectStorage().objects().list("test2");
//             for(SwiftObject swiftObject: swiftObjects) {
//                 System.out.println("name: "+swiftObject.getName());
//             }
//             SwiftObject swiftObject = os.objectStorage().objects().get("test2", "folder/nova");
//             
//             System.err.println("SwiftObject: "+swiftObject.getMetadata().get("Etag"));
//             System.err.println("SwiftObject: "+swiftObject.getMetadata().get("Content-Type"));
//            System.out.println("test: "+swiftObject.getName());
//            System.out.println("test: "+swiftObject);
//            
//            System.out.println("endpoint: "+endpoints.iterator().next().getRegion());
            //swift api
//            File file = new File("/home/lakshmi/Desktop/keystone.pdf");
//            
//            Map<String, String> map = new HashMap<String, String>();
//            map.put("Content-Type", "application/pdf");
//            map.put("name", "keystone.pdf");
//////////            
//             String checkSum = os.objectStorage().objects().put("container1", "keystone1", Payloads.create(file), ObjectPutOptions.create().contentType("application/pdf").metadata(map));
//             System.out.println("checkSum: "+checkSum);
            //download
//            System.out.println("os.getAccess().getCacheIdentifier(): "+os.getAccess());
//            String string = os.objectStorage().objects().copy(ObjectLocation.create("images", "imag2"), ObjectLocation.create("photos", "newImage"));
////            
//           DLPayload dLPayload =  os.objectStorage().objects().download(ObjectLocation.create("test2", "key"), DownloadOptions.create());
//           
//            System.out.println("dLPayload: "+dLPayload.getInputStream());
//            Map<String, String> md = os.objectStorage().objects().getMetadata("container1", "keystone1");
////            
//            System.out.println("md: "+md.get("X-Object-Meta-Name"));
//            System.out.println("md: "+md.get("Content-Type"));
//            System.out.println("md: "+md);
//           
//           File file = new File("/home/lakshmi/Desktop/test.pdf");
//        dLPayload.writeToFile(file);
//           ByteStreams.copy(inputStream, new FileOutputStream(file));
//           BufferedReader reader = null;
//            StringBuilder stringBuilder;
//           
//             // read the output from the server
//            reader = new BufferedReader(new InputStreamReader(dLPayload.getInputStream()));
//            stringBuilder = new StringBuilder();
//
//            String line = null;
//            while ((line = reader.readLine()) != null) {
//              stringBuilder.append(line);
//            }
//           FileInputStream fileInputStream = new FileInputStream(file);
//            System.out.println("output" + object.toString());
//           
//            File file = new File("/home/lakshmi/Desktop/teswt.txt");
//            dLPayload.writeToFile(file);
//            Sy
//            os.objectStorage().objects().download("http://68.233.240.159/dashboard/project/containers/images/SVN.docx/download", null);
//            System.out.println("string: "+string);
//            
//            ActionResponse actionResponse = os.objectStorage().objects().delete("test", "test-abdul1/");
////            
//            System.out.println("actionResponse:"+actionResponse);
            //            System.out.println("volume id"+v.getName());
//            HttpRequest httpRequest = new HttpRequest();
//            
//            httpRequest.getHeaders().put("Accept", "application/json");
//            os.objectStorage().containers().create("test_admin");
//          List<? extends SwiftContainer> swiftContainers = os.objectStorage().containers().list();
//          
//          for(SwiftContainer swiftContainer : swiftContainers) {
//              System.out.println(""+swiftContainer.getName());
//              System.out.println(""+swiftContainer.getContentType());
//              System.out.println(""+swiftContainer.getTotalSize());
//              System.out.println(""+swiftContainer.getObjectCount());
//              System.out.println(""+swiftContainer.getLastModified());
//          }
//            System.out.println("list: "+swiftContainers);
//            String hashValue = os.objectStorage().containers().createPath("test", "images/JPG/folder1");
//            System.out.println("hashValue: "+hashValue);
//            os.objectStorage().containers().delete("abdul");
//                     VNCConsole vNCConsole = os.compute().servers().getVNCConsole(null, null);
            //File upload
//            File file = new File("/home/lakshmi/Desktop/SVN.doc");
//            URL url = new URL("http://www.9ori.com/en/media/images/doll.jpg");
//            String checkSum = os.objectStorage().objects().put("images", "testSVN", 
//                                               Payloads.create(file), 
//                                               ObjectPutOptions.create().contentType("application/msword"))   ;
////            
//            System.out.println("checkSum: "+checkSum);
//            os.objectStorage().objects().delete("test", "image");
//            List<? extends SwiftContainer> swiftContainers = os.objectStorage().containers().list();
//            for(SwiftContainer swiftContainer : swiftContainers) {
//                System.out.println("name: "+swiftContainer.getName());
//                if(swiftContainer.getName().equals("test")) {
//                    System.out.println("name: "+swiftContainer.getName());
//                    System.out.println("size"+swiftContainer.getObjectCount());
//                    System.out.println("size"+swiftContainer.getTotalSize());
//                    System.out.println("size"+swiftContainer.);
//                }
//            }
//            System.out.println("list: "+os.objectStorage().objects().list("test"));
//            List<? extends SwiftObject> swiftObjects = os.objectStorage().objects().list("test",ObjectListOptions.create().path("images") );
//            List<? extends SwiftObject> swiftObjects = os.objectStorage().objects().list("images");
//           
//            for(SwiftObject swiftObject: swiftObjects) {
//                
//                System.out.println("name: "+swiftObject.getName());
//                System.out.println("is dirctory: "+swiftObject.isDirectory());
//                System.out.println("mime type: "+swiftObject.getMimeType());
//                System.out.println("Size: "+swiftObject.getSizeInBytes());
//            }
//            System.out.println("list"+os.telemetry().meters().samples("cpu_util"));
//            List<? extends SwiftObject> swiftObjects = os.objectStorage().objects().list("test",ObjectListOptions.create().path("images") );
//            
//            for(SwiftObject swiftObject: swiftObjects) {
//                
//                System.out.println("name: "+swiftObject.getName());
//                System.out.println("is dirctory: "+swiftObject.isDirectory());
//                System.out.println("mime type: "+swiftObject.getMimeType());
//                System.out.println("mime type: "+swiftObject.getSizeInBytes());
//            }
//            System.out.println("test: "+os.objectStorage().containers().getMetadata("test"));
//            
//            String etag = os.objectStorage().objects().put("test", "/newpath", null);
//            System.out.println("etag; "+etag);
//            
//            System.out.println("testt  :"+string);
//            os.objectStorage().objects().
//            ActionResponse actionResponse = os.objectStorage().containers().create("images", CreateUpdateContainerOptions.create()
//            .accessRead(".r")
//            .accessWrite(".w"));
//            
//            System.out.println("response :"+actionResponse.toString());
//                       
//            System.out.println("container: "+os.objectStorage().objects().list(null));
//            List<? extends SwiftObject> swiftObjects = os.objectStorage().objects().list("test");
//            
//            
//            for(SwiftObject swiftObject: swiftObjects) {
//                System.out.println("name: "+swiftObject.getName());
//                System.out.println("size: "+swiftObject.getSizeInBytes());
//                System.out.println("mimeType: "+swiftObject.getMimeType());
//                System.out.println("last modified: "+swiftObject.getLastModified());
//                System.out.println("directory: "+swiftObject.isDirectory());
//                System.out.println("containerName: "+swiftObject.getContainerName());
//                System.out.println("tag: "+swiftObject.getETag());
//            }
//            for(SwiftContainer swiftContainer : swiftContainers) { 
//                System.out.println("name: "+swiftContainer.getName());
//                
//            }
//            os.objectStorage().containers().create("sample");
//            
//            System.out.println("account: "+);
//           os.objectStorage().containers().create("meter");
//            System.out.println("os tenant :"+ os.objectStorage().objects().put(null, null, null, ObjectPutOptions.NONE));
//            System.out.println("swiftContainers"+os.objectStorage().account().get());
//            
//            os.compute().flavors().list();
//            for(SwiftContainer swiftContainer : swiftContainers) {
//                System.out.println("swift"+swiftContainer.toString());
//            }
//
//           Flavor flavor = os.compute().flavors()
//                  .create(Builders.flavor()
//                          .name("nandini-test11")
//                          .ram(512)
//                          .vcpus(1)
//                          .disk(1)
//                          .swap(1)
//                          .ephemeral(2)
//                          .rxtxFactor(2)
//                          .isPublic(true)
//                          .build());
//            os.compute().servers().boot(null)
//            OpenStackServer server = new OpenStackServer("http://162.252.80.100:5000/v3", "12725cd8cd144037bf755d7db4eab278", "b4226fea6b394047", null);
//            OSClient os = server.authenticate();
//            NetFloatingIP netFloatingIP = os.networking().floatingip()
//                                             .disassociateFromPort(null);
//            Port port = os.networking().port().get("e3e9db5c-6505-4694-b96c-cf00003922e5");
//            System.out.println("port"+port);
//            ActionResponse actionResponse = os.compute().servers().resize("e3e9db5c-6505-4694-b96c-cf00003922e5", "e98457cf-edec-4717-b0a4-c21970fa74b5");
//            Router router = os.networking().router().get("7f2df070-e3c0-4c4e-a047-95a885990b30");
//            
//            
//            System.out.println("router--"+routerGateway.toString());
//            List<? extends Image> images = os.images().list();
//            
//            for(Image image : images) {
//                System.out.println("image"+image.isSnapshot());
//                System.out.println("image"+image.getName());
//            }
//            List<String> tste = new ArrayList<String>(); 
//            List<String> network = new ArrayList<String>(); 
//            
//            network.add("27884476-cd94-4cca-ac43-d9d82176aadc");
//            network.a
//            os.objectStorage().containers().delete("abdul");
//             String Str = new String("images/tre");
//      String name = "";
//      
//      if(Str.indexOf("/") != -1) {
//          String[] split = Str.split("/");
//          int splitSize = split.length;
//          System.out.println("size: "+splitSize);
//          for(int i=0; i< splitSize; i++) {
//              name = split[splitSize-1];
//              System.out.println("name: "+name);
//          }
//      }
//            File file = new File("/home/lakshmi/Desktop/gsp");
//            URL url = new URL("http://www.9ori.com/en/media/images/doll.jpg");
//            os.objectStorage().objects().put("test", "MineImg", 
//                                               Payloads.create(url), 
//                                               ObjectPutOptions.create()  )   ;
//            os.objectStorage().objects().delete("test", "image");
//            List<? extends SwiftContainer> swiftContainers = os.objectStorage().containers().list();
//            for(SwiftContainer swiftContainer : swiftContainers) {
//                System.out.println("name: "+swiftContainer.getName());
//                if(swiftContainer.getName().equals("test")) {
//                    System.out.println("name: "+swiftContainer.getName());
//                    System.out.println("size"+swiftContainer.getObjectCount());
//                    System.out.println("size"+swiftContainer.getTotalSize());
//                    System.out.println("size"+swiftContainer.);
//                }
//            }
//            System.out.println("list: "+os.objectStorage().objects().list("test"));
//            
//            ServerCreate sc = Builders.server().name("requestData.name").flavor("requestData.flavor")
//                                .image("")
////                                .networks("")
//                                .keypairName("")
////                                .securityGroups("")
//                                .availabilityZone("")
//                                .build();
//            
//          os.compute().servers().
//            System.out.println("test: "+os.objectStorage().containers().getMetadata("test"));
//            
//            String etag = os.objectStorage().objects().put("test", "/newpath", null);
//            System.out.println("etag; "+etag);
//            
//            System.out.println("testt  :"+string);
//            os.objectStorage().objects().
//            ActionResponse actionResponse = os.objectStorage().containers().create("images", CreateUpdateContainerOptions.create()
//            .accessRead(".r")
//            .accessWrite(".w"));
//            
//            System.out.println("response :"+actionResponse.toString());
//                       
//            System.out.println("container: "+os.objectStorage().objects().list(null));
//            List<? extends SwiftObject> swiftObjects = os.objectStorage().objects().list("test");
//            
//            
//            for(SwiftObject swiftObject: swiftObjects) {
//                System.out.println("name: "+swiftObject.getName());
//                System.out.println("size: "+swiftObject.getSizeInBytes());
//                System.out.println("mimeType: "+swiftObject.getMimeType());
//                System.out.println("last modified: "+swiftObject.getLastModified());
//                System.out.println("directory: "+swiftObject.isDirectory());
//                System.out.println("containerName: "+swiftObject.getContainerName());
//                System.out.println("tag: "+swiftObject.getETag());
//            }
//            for(SwiftContainer swiftContainer : swiftContainers) { 
//                System.out.println("name: "+swiftContainer.getName());
//                
//            }
//            os.objectStorage().containers().create("sample");
//            
//            System.out.println("account: "+);
//           os.objectStorage().containers().create("meter");
//            tste.add("test");
//            tste.add("ABDUL");
//            os.networking().router().update(Builders.router()
//
//                    .id("adee906b-cf12-4538-996b-c70098ef81de").build());
//            Router router = os.networking().router().get("a23867f9-1f61-48d2-be60-2f9d0cf18c4c");
//            System.out.println("router"+router);
//            
//            Router routerGateway = os.networking().router().update(router.toBuilder().name("Router1").build());
//            Router routerGateway = os.networking().router().setGateway(router.toBuilder().externalGateway("3db331f0-b5d7-4381-bbc8-03859acc80a2").build());
//            System.out.println("routerGateway"+routerGateway);
//            Image image = os.images().upload(null, null, null);
//            
//            ServerCreate sc = Builders.server()
//                          .name("Teat Instance")
//                          .flavor("e98457cf-edec-4717-b0a4-c21970fa74b5")
//                          .image("04f9912e-1504-4d51-8310-acfae15efe3f")
//             
//            .securityGroups(null)
//                    .availabilityZone("nova").build(); 529876b3-1268-4ee0-8f94-34215e9bd2f9
//           
//           Image image = os.images().update(Builders.image().id("529876b3-1268-4ee0-8f94-34215e9bd2f9")
//                   
//                   .isPublic(Boolean.TRUE)
//                   .isProtected(Boolean.TRUE)
//                   .name("Image Update").build());
//           
//            
//            Server vm = os.compute().servers().boot(sc);
//            
//             System.out.println("sc"+vm.getId());
//            User openstackUser = os.identity().users().create(Builders.user().tenantId("4e2fa59337b4436888527af1c196ecaf")
//                                                      .domainId("06d7c0e934b84c539af7dbb760cef535") 
//                                                      .name("abdul123")
//                                                      .password("abdul123").email("abdul@gmail.com").enabled(true).build());
//            Rule rule = os.compute().securityGroups().createRule(Builders.secGroupRule().parentGroupId("19857baf-3056-4eef-8cd5-59a172e89dee")
//                    .protocol(IPProtocol.TCP)
//                    .range(12, 35)
//                    .cidr("198.168.2.9/24").direction("egress").etherType("IPv6").build());
//            ActionResponse actionResponse = os.networking().port().delete("c1f2a25a-d61a-4c60-a795-b01dfd679a3e");
//            System.out.println("action: "+actionResponse.toString());
//            System.out.println("list net: "+os.networking().network().list());
//            List<? extends Network> networks = os.networking().network().list();
//            System.out.println(" list"+networks.size());
//            for(Network network : networks) {
//                
//                System.out.println(" list"+network.getName());
//            }2caaca6d-3125-4672-b211-15b6d50f9de1
//            NetFloatingIP netFloatingIP = os.networking().floatingip().create(Builders.netFloatingIP()
//                     .floatingNetworkId("1a4aa722-f49a-4d04-9c40-2045c19bd4cf")
//                    .build());
//            List<? extends NetFloatingIP> floatingIPs = os.networking().floatingip().list();
//            for(NetFloatingIP  floatingIP : floatingIPs) {
//                System.out.println("fp"+floatingIP.getId());
//            }
//            
//            System.out.println("flo list" +netFloatingIP.getId());
//            System.out.println("flo list" +netFloatingIP.getPortId());
//            System.out.println("flo list" +netFloatingIP.getTenantId());
//            System.out.println("flo list" +netFloatingIP.getRouterId());
//            System.out.println("flo list" +netFloatingIP.getFloatingNetworkId());
//            System.out.println("flo list" +netFloatingIP.getFixedIpAddress());
//            
//            NetFloatingIP netFloatingIP = os.networking().floatingip().associateToPort("1d2444a6-8a42-4e08-95d0-b2e63d439426", "2caaca6d-3125-4672-b211-15b6d50f9de1");
//            System.out.println("netFloatingIP"+netFloatingIP);
//            NetFloatingIP netFloatingIP1 = os.networking().floatingip().disassociateFromPort(null);
//            System.err.println("netFloatingIP1"+os.networking().floatingip().list().iterator().next().getRouterId());
//            System.out.println("list"+os.networking().port().list());
//            List<? extends Port> ports = os.networking().port().list();
//            for(Port port : ports) {
//                System.out.println(""+port.getDeviceOwner());
//                String owner = "compute:nova";
//                if(port.getDeviceOwner().equals(owner)) {
//                    System.out.println("owner is:"+port.getDeviceOwner());
//                    System.out.println("ips:"+port.getFixedIps());
//                    System.out.println("ips:"+port.getDeviceId());
//                }
//            }
//            
//            Network network = os.networking().network().create(Builders.network().adminStateUp(true)
//                    .isRouterExternal(true)
//                    .name("ABDUL test")
//                    .build());
//            Network network = os.networking().network().get("19a0a1bc-5d5a-4811-adfe-a2f48a5a2320");
//            os.networking().network().update(network.getId(), Builders.networkUpdate().name("ABDUL TEST").adminStateUp(true).build());
//            Port port = os.networking().port().create(Builders.port()
//                    .networkId("19a0a1bc-5d5a-4811-adfe-a2f48a5a2320")
//                    .deviceId(null)
//                    .deviceOwner(null)
//                    .adminState(true)
//                    .name("test new")
//                    .build()
//            );
//
//            ActionResponse actionResponse = os.networking().port().delete("6db37661-04e6-487c-baea-007440f8ad9c");
//            System.out.println("rule" + rule.getDirection());
//rout
//            ExternalGateway externalGateway;
//            Router router1 = os.networking().router().get("ffb2cb43-e6dd-4e05-9afc-4f80f5a210f9");
//System.out.println("router1"+router1.getExternalGatewayInfo());
//           Router router =  os.networking().router().deleteGateway("a4903edb-8e6b-4a4b-b138-12857689d2f7");
//           Router router =  os.networking().router().update(router1.toBuilder()
//                   .name("ABDUL").build());
//            System.out.println("router"+router.getExternalGatewayInfo());
//           
//             os.networking().router().create(Builders.router().name("abdul")
//                     .adminStateUp(true)
//                     
//                     .tenantId("null").build());
//            List<? extends Router> routers = os.networking().router().list();
//            
//            for(Router router : routers) {
//                System.out.println("rout of route:  "+ router.getRoutes());
//                
//            }
//            
//            RouterInterface routerInterface = os.networking().router().attachInterface("f809e07b-2138-4dad-8467-690cb079c827", AttachInterfaceType.SUBNET,"8d0f7795-9210-4189-abc7-7ce5d5c507fe");
//            System.out.println("routerInterface.getPortId()" +routerInterface.getPortId());
//            System.out.println("routerInterface.getPortId()" +routerInterface.getId());
//            
//            Port port = os.networking().port().get(routerInterface.getPortId());
//            ActionResponse actionResponse = os.networking().router().delete("887d5b2b-36ad-4c0e-bca5-8f9886c11ba9");
//            System.out.println("res : "+actionResponse.isSuccess());
//            System.out.println("res : "+actionResponse.getFault());
//            RouterInterface routerInterface = os.networking().router()
//                                              .attachInterface("30953eb0-f577-46fa-aabd-af6eeeb4404f",AttachInterfaceType.SUBNET, "");
//            
//            Port port = os.networking().port().create(Builders.port()
//                    .deviceId("30953eb0-f577-46fa-aabd-af6eeeb4404f")
//                    .networkId("65fc7d4e-2c0a-4d43-a0b5-b672ea106c5e")
//                    .fixedIp("192.168.2.1","d82aebea-63fc-4c81-b7f0-406b69fe8751")
//                    .build());
//           List<? extends Port> ports = os.networking().port().list();
//            System.out.println("ports"+ports);
//            for(Port port : ports) {
//                
//                if(port.getDeviceId().equals("30953eb0-f577-46fa-aabd-af6eeeb4404f")) {
//                    System.out.println("port"+port.toString());
//                }
//            }
//           List<? extends Port> ports = os.networking().port().list();
//           
//           for(Port port : ports) {
//              if(port.getDeviceId().equals("70386f62-a3a4-4ad6-a5fc-4abbbaa768af")) {
//                  System.out.println("owner" +port.getDeviceOwner());
//                  System.out.println("owner" +port.isAdminStateUp());
//                  System.out.println("owner" +port.getState());
//                  System.out.println("owner" +port.getFixedIps().iterator().next().getIpAddress());
//                  System.out.println("owner" +port.getName());
//               
//              }
//               
//           }
//            RouterInterface routerInterface = os.networking().router().detachInterface("ffb2cb43-e6dd-4e05-9afc-4f80f5a210f9", "1347ad47-026f-4e5a-8306-93b958e9c7a7", "66360dbd-a03b-4115-ba7b-7892b98ae4f8");
//            routerInterface.getPortId();
//            List<? extends VolumeSnapshot> vS = os.blockStorage().snapshots().list();
//            
//            for(VolumeSnapshot volumeSnapshot : vS ){
//                volumeSnapshot.getSize();
//            }
//            os.networking().router().
//            
//            List<? extends Server> vms = os.compute().servers().listAll(true);
////
//            for (Server vm : vms) {
//                
//                 Map<String, List<? extends Address>> address = vm.getAddresses().getAddresses();
//                String ips = "";
//                int totalAddress = address.entrySet().size();
//                int i=1;  
//                 for(Map.Entry<String, List<? extends Address>> entrySetAdd: address.entrySet()) {
//                            
//                            for(Address address1 : entrySetAdd.getValue()) {
//                                System.out.println("size"+entrySetAdd.getValue().size());
//                                
//                                ips = ips + address1.getAddr();
//                        
//                        
//                        if(totalAddress != i++) {
//                            ips+= ", ";
//                         
//                        }
//                                
//                            }
//                            System.out.println("add"+ips);
//                 }
//            }
//            List<? extends Port> ports = os.networking().port().list();
//            
//            for(Port port : ports) {
//                
//                String ips = "";
//                int i=1;
//                //System.out.println("port ip"+port.getFixedIps());
//                for(IP ip : port.getFixedIps()) {
//                    
//                    int fixedIps = port.getFixedIps().size();
//                    
//                    ips = ips + ip.getIpAddress();
//                    if(fixedIps != i++) {
//                        ips+= ",";
//                    }
//               
//                   
//                }
//                                
//                 System.out.println("ips"+ips);
//            } 
//os.networking().network().get("e9019bf2-2006-4ef4-9afc-1eb85bb4f6d8");
//            
//            os.networking().network().list();
//            SecurityGroupRule securityGroupRule = os.networking().securityrule().create(Builders.securityGroupRule()
//                    .direction("egress")
//                    .securityGroupId("19857baf-3056-4eef-8cd5-59a172e89dee")
//                    .portRangeMin(0)
//                    .portRangeMax(0)
//                    .protocol("55")
//                    .remoteIpPrefix("192.0.0.1/24")
//                    .remoteGroupId(null)
//                    .build());
//            System.out.println("securityGroupRule--"+securityGroupRule.toString());
//            System.out.println("securityGroupRule"+securityGroupRule.getRemoteIpPrefix());
//            System.out.println("securityGroupRule"+securityGroupRule.getPortRangeMax());
//            System.out.println("securityGroupRule"+securityGroupRule.getPortRangeMin());
//            System.out.println("securityGroupRule"+securityGroupRule.getProtocol());
//            System.out.println("securityGroupRule"+securityGroupRule.getEtherType());
//            System.out.println("securityGroupRule"+securityGroupRule.getSecurityGroupId());
//            System.out.println("securityGroupRule id : "+securityGroupRule.getId());
//            System.out.println("securityGroupRule"+securityGroupRule.getDirection());
//            System.out.println("securityGroupRule"+securityGroupRule.getTenantId());
//            List<? extends SecurityGroupRule> groupRules = os.networking().securityrule().list();
//            System.out.println("group rules-->"+groupRules);
//            for(SecurityGroupRule groupRule : groupRules) {
//                
//                System.out.println(""+groupRule.getEtherType());
//                System.out.println(""+groupRule.getProtocol());
//                if(groupRule.getSecurityGroupId().equals("19857baf-3056-4eef-8cd5-59a172e89dee")) {
//                    
//                    System.out.println("rule id"+groupRule.getId());
//                    System.out.println("rule id"+groupRule.getProtocol());
//                }
//            }
//            ActionResponse actionResponse = os.networking().securityrule().delete("ba83aaac-c06d-4a51-bf52-ee9ea96406b7");
//            actionResponse.getFault()
////            
//            System.out.println("actionResponse" + actionResponse.isSuccess());
//            SecurityGroup securityGroup = os.networking().securitygroup().create(Builders.securityGroup().name("test net").description("dec").build());
//            os.compute().securityGroups().list().iterator().next().getRules()
//            SecurityGroup securityGroup = os.networking().securitygroup().get("19857baf-3056-4eef-8cd5-59a172e89dee");
//            for (SecurityGroupRule rule : securityGroup.getRules()) {
//                
//                System.out.println(""+rule.getDirection());
//                System.out.println(""+rule.getId());
//                System.out.println(""+rule.getProtocol());
//                System.out.println(""+rule.getEtherType());
//                System.out.println(""+rule.getRemoteGroupId());
//                System.out.println(""+rule.getRemoteIpPrefix());
//                System.out.println(""+rule.getPortRangeMin());
//                System.out.println(""+rule.getPortRangeMax());
//                System.out.println(""+rule.getSecurityGroupId());
//                System.out.println(""+rule.getTenantId());
//                System.out.println(""+rule.toString());
//                
//                System.out.println("---------------------");
//                
//            }
//            
//            System.out.println("sec id"+securityGroup.getRules().iterator().next().getDirection());
//            ActionResponse actionResponse = os.networking().securitygroup().delete("1e5ccfa5-0f4a-4be4-a18e-327e244b9f69");
//            SecurityGroup securityGroup1 = os.networking().securitygroup().update("19857baf-3056-4eef-8cd5-59a172e89dee", "update test", "desc update");
//            System.out.println("securityGroup1"+securityGroup1.getTenantId());
//          os.compute().securityGroups().update(null, null, null)
//            System.out.println("actionResponse"+actionResponse.isSuccess());
//            System.out.println("groupRule"+groupRule);
//            System.out.println(""+router.getId());
//            System.out.println(""+router.getTenantId());
//            System.out.println(""+router.isAdminStateUp());
//            System.out.println(""+router.getStatus());
//            
//            os.networking().router().attachInterface(null, AttachInterfaceType.PORT, null);
//            
            //availability zone
//            List<? extends AvailabilityZone> availabilityZones = os.compute().zones().list(true);
//            
//            for(AvailabilityZone availabilityZone : availabilityZones) {
//                System.out.println(""+availabilityZone.getZoneName());
//                System.out.println(""+availabilityZone.getZoneState().getAvailable());
//                Map<String, Map<String, ? extends AvailabilityZone.NovaService>> availabilityZoneMap = availabilityZone.getHosts();
//                
//                for(Map.Entry<String, Map<String, ? extends AvailabilityZone.NovaService>> entry : availabilityZoneMap.entrySet()) {
//                    System.out.println(""+entry.getKey());
//                }
//                
//            }
//             User openstackUser = os.identity().users().create(Builders.user()
//                     .name("abdul@gmail.com")
//                     .enabled(true)
//                     .tenantId("f6f9c97ce79041d0bd0758cbf0c10beb")
//                     .domainId("4f8c7820624f436396252a2e19d54d57")
//                     
//                     .build());
//            System.out.println("user list"+ os.identity().users().list());;
//            Flavor flavors = os.compute().flavors().get(null);
//            os.compute().flavors().create(flavors);
            //using domain to auth
//            OpenStackServer server = new OpenStackServer("http://68.233.240.158:5000/v3", "admin", "8bfec7d5baf84739", "Default");
//            OSClient os = server.authenticate();
//              os.identity().projects().delete("07f0acd535794dc99bad7ff75bf9683b");
//            System.out.println("user"+os.identity().users().get("c3673e7af8de4da7ad3eb0d025f277b5"));
//            User user = os.identity().users().get("c3673e7af8de4da7ad3eb0d025f277b5");
//           User user1 = os.identity().users().update(user.toBuilder()
//                     .name("balaji 123")
//                    .tenantId("69cefee221a84848bceca93a8dd06e57")
//                    .password("password1")
//                    .email("abdul123243243@gmail.com")
//                    .enabled(true)
//                    .build());
//            System.out.println("user1"+user1);
//            os.identity().users().changePassword("08a9c8d5d5c14436b34cdf46dbb4b1cf", "password1");
//              Role role = os.identity().roles().getByName("RETAIL");
//              Role role = os.identity().roles().create("abdul");
//              Role role = os.identity().roles().get("8a82954a7560407289e52566bd558ebd");
//              System.out.println("os "+os.compute().images().list());/////////////              ActionResponse actionResponse = os.identity().users().changePassword("c3673e7af8de4da7ad3eb0d025f277b5", "abdul123");/              System.out.println("actionResponse "+actionResponse.isSuccess());
//              if(role == null) {
//                  System.out.println("role list"+os.identity().roles().list());
//              } else {
//                  System.out.println("role ok");
//              }
//              os.identity().users().delete("");
//              os.identity().roles().delete(null);
//            List<? extends Keypair> keyPairs = os.compute().keypairs().list();
//            for(Keypair keypair: keyPairs) {
//                System.out.println("keypair list"+keypair.getPrivateKey());
//            }
//            System.out.println("Authenticate"+os);
//            os.compute().zones().getAvailabilityZones().getAvailabilityZoneList();
//            System.out.println("keypair list"+keyPairs.iterator().next().getFingerprint());
//            os.blockStorage().volumes().listVolumeTypes();
//            System.out.println("list vt"+os.blockStorage().volumes().listVolumeTypes());
//            ActionResponse actionResponse  = os.blockStorage().volumes().deleteVolumeType("f6f2e480-f04f-49f8-bb25-229e00eabb30");
//            os.blockStorage().volumes().createVolumeType("abdul123");
//            os.blockStorage().volumes().getVolumeType("id");
//            os.blockStorage().volumes().listVolumeTypes();
//          System.out.println("volumeType vt 1"+actionResponse.isSuccess());
//            OpenStackServer server = new OpenStackServer("http://68.233.240.158:5000/v3", "1695bca00bf24914a66fb03295559179", "e00c5856db69325523bd9281d67c7364065226517d1cd774380c96df525c39d8", null);  
//            OSClient os = server.authenticate();
//            Network openstackNetwork = os.networking().network()
//            .create(Builders.network().name("abdul").adminStateUp(true).isShared(false).build());
//           System.out.println("port list" +os.networking().port().list());
//           List<? extends Port> ports = os.networking().port().list();
//           for(Port port : ports) {
//               System.out.println("device id" +port.getNetworkId());
//               String deviceId = port.getNetworkId();
//
//               if(deviceId != null && !deviceId.isEmpty() && deviceId != "null" && deviceId.equals("cf176a5e-840d-4505-95c2-60596af85b09")) {
//                   System.out.println("port.getFixedIps() id" +port.getFixedIps());
//                   for(IP ip : port.getFixedIps()) {
//                       System.out.println("ip add"+ip.getIpAddress());
//                       System.out.println("Subnet id"+ip.getSubnetId());
//                   }
//                   
//                   System.out.println("Device owner"+port.getDeviceOwner());
//                   System.out.println("MAc add"+port.getMacAddress());
//                   System.out.println("Network id"+port.getNetworkId());
//                   System.out.println("status :"+port.getState());
//                   System.out.println("Admin state:"+port.isAdminStateUp());
//                   System.out.println("project id: "+port.getTenantId());
//                   System.out.println("port id : "+port.getId());
//                   System.out.println("port name: "+port.getName());
//                   System.out.println("sec gr:"+port.getSecurityGroups());
//               }
//           } 
//           Port port = os.networking().port().get("7483b936-5215-4676-b844-d0e37a8eaa41");
//            System.out.println("port"+port);
//           os.networking().port().update(port.toBuilder().name("test1").build());
//         os
//            KeystoneTokenV3 token = (KeystoneTokenV3) os.getAccess().getToken();
//            System.out.println("Catalog:" + token.getCatalog().iterator().next().getEndpoints().iterator().next().getRegion());
//            HashMap<String, Boolean> regions = new HashMap<>();
//            for (Catalog catalog : token.getCatalog()) {
//                for (EndpointV3 endpoint : catalog.getEndpoints()) {
////                    System.out.println("Region:" + endpoint.getInterface());
////                    System.out.println("id:" + endpoint.getURL());
//                    if(endpoint.getInterface().equals("PUBLIC")) {
//                        System.out.println("Region:" + endpoint.getRegion());
//                    System.out.println("id:" + endpoint.getURL());
//                    }
//                    regions.put(endpoint.getRegion(), Boolean.TRUE);
//                }
//                 System.out.println("id:" + catalog.getId());
//                 System.out.println("type:" + catalog.getType());
//                 if(catalog.getType().equals("network")) {
//                     System.out.println("Type: " + catalog.getEndpoints().iterator().next().getURL().toString());
//                     for(EndpointV3 endpointV3: catalog.getEndpoints()) {
//                         System.out.println("url: "+endpointV3.getURL());
//                     }
//                 }
//            }
//
//            TokenV3 tokenV3 = (TokenV3) os.getAccess().getToken();
//
//            System.out.println("project domain:" + token.getProject().getDomain().getName());
//            for(String region: regions.keySet()) {
//                System.out.println("Region:" + region);
//                
//            }
//                        Network openstackNetwork = os.networking().network()
//            .create(Builders.network().name("ciscoR2").adminStateUp(true).isShared(false).build());
//                        List<? extends Network> networks = os.networking().network().list();
//                for(Network network : networks) {
//                    System.out.println("name: "+network.getName());
//                }
////            System.out.println("Roles:" + user.getRoles());
////            System.out.println("Project:" + token.getProject().getName());
////            System.out.println("Project ID:" + token.getProject().getId());
////            System.out.println("Project users count: " + os.identity().tenants().listUsers(token.getProject().getId()).size());
//            List<? extends Domain> domains = os.identity().domains().list();
//
////            List<? extends Region> regions = os.getAccess();
////            System.out.println("Domains count: " + domains.size());
//            for (Domain domain : domains) {
//                System.out.println("Domain:  " + domain.toString());
//            }
//            Project project = os.identity().projects().get("4a6dcf583b3e413cbc962c04fc79314b");
//            
//            System.out.println("project----:  " + project.getDomainId());
//            List<? extends Project> projects = os.identity().projects().list();
//            for (Project project : projects) {
////                System.out.println("project----:  " + project.toString());
//            }
//            Keypair kp = os.compute().keypairs().create("", null);
//            os.useRegion("RegionOne");
//            List<? extends Server> eastServers = os.compute().servers().list();
//            for(Server server1 : eastServers) {
//                System.out.println("ser : "+server1.getName());
//            }
//            OSClient os = OSFactory.builder()
//                       .endpoint("http://68.233.240.158:5000/v2.0")
//                       .credentials("admin","8bfec7d5baf84739")
//                       .tenantName("admin")
//                       .authenticate();
//            List<? extends VolumeType> volumeTypes = os.blockStorage().volumes().listVolumeTypes();
//            System.out.println("volumeTypes"+volumeTypes);
//            
//            Set<ServiceType> serviceType = os.getSupportedServices();
//            System.out.println("serviceType"+serviceType);
//            
//            os.blockStorage().snapshots().delete("");
//            List<? extends Meter> meters = os.telemetry().meters().list();
            //volume list
//            List<? extends Volume> volumess = os.blockStorage().volumes().list();
//            Volume volume = os.blockStorage().volumes().get(null);
//            System.out.println("volumes"+volumess);
//            
//            for (Volume openStackVolume : volumess) {
//             
//                     System.out.println("volumes"+opeThis is an Admin API extension. Applicable to validate token (GET) and check token (HEAD) APIs only.nStackVolume.getAttachments());
//                
//            }
//            List<? extends VolumeSnapshot> snapshot = os.blockStorage().snapshots().list();
//            System.out.println("volumes"+snapshot);
//            List<? extends Service> serviceList = os.getAccess().getServiceCatalog();
//            System.out.println("serviceList"+serviceList.iterator().next().getName());
//            for(Service service : serviceList) {
//                System.out.println("serviceList"+service.getEndpoints().iterator().next().getRegion());
//            }
//            
//           os.useRegion("EastRegion");
//            Volume openStackVolume = os.blockStorage().volumes().create(Builders.volume()
//                                     .snapshot(null).build());
//
//            List<? extends Server> eastServers = os.compute().servers().list();
//             System.out.println("serviceList" + eastServers);
//            for (Server allServer : eastServers) {
//
//                System.out.println("serviceList" + allServer.getHost());
//            }
//            System.out.println("serviceList" + eastServers.iterator().next().getHostId());
//            AvailabilityZones availabilityZones = os.compute().zones().getAvailabilityZones();
//            List<? extends AvailabilityZones> listZone = availabilityZones.getAvailabilityZoneList();
//            
//            List<? extends AvailabilityZone> zones =  os.compute().zones().getAvailabilityZones().getAvailabilityZoneList();
//            
//             System.out.println("zones: " + zones);
//             for (AvailabilityZone zone : zones) {
////
//                System.out.println("zone: " + zone.getHosts().keySet().iterator().next());
//                System.out.println("zone: " + zone.getZoneName());
//                System.out.println("zone: " + zone.getZoneState().getAvailable());
//            }
//           ServerCreate sc = Builders.server()
//                          .name("Teat Instance Zone")
//                          .flavor("06a67fac-3793-40a9-8d7d-126b94816e1a")
//                          .image("2f7271bd-de52-4c6f-b1ef-6366bbd42477")
//                          .availabilityZone("nova").build();
//            
//            SecGroupExtension group = os.compute().securityGroups().create("secGroup", "test");
//            List<? extends SecGroupExtension> sg = os.compute().securityGroups().list();
//            SecGroupExtension group = os.compute().securityGroups().create("secGroup", "test");
//            SecGroupExtension group = os.compute().securityGroups().update("d32e62c6-0864-40f0-9881-76323367d2cd", "security", "update");
//            Payload<File> payload = Payloads.create(new File("/path/to/vmimage.img"));
//            ImageBuilder imagebuilder = image.toBuilder().diskFormat(DiskFormat.RAW);
//            Image images = os.images().upload(image.getId(),imagebuilder.build());
//            Image image = os.images().get("04f9912e-1504-4d51-8310-acfae15efe3f");
//            os.images().update(image.toBuilder()
//           .name("cirros").isPublic(true).diskFormat(DiskFormat.RAW).build());
//            SecGroupExtension group = os.compute().securityGroups().get("fd91a56e-bee5-414f-b279-b3af570c47f8");
//            Rule rule = os.compute().securityGroups().
//            System.out.println("list"+group.getRules());
//            
//            for (Rule rule : group.getRules()) {
//                System.out.println("list---");
//            System.out.println("id"+rule.getId());
//            System.out.println("parent id"+rule.getParentGroupId());
//            System.out.println("protocol"+rule.getIPProtocol());
//            System.out.println("range"+rule.getRange());
//            System.out.println("name"+rule.getName());
//            System.out.println("cidr"+rule.getRange().getCidr());
//            System.out.println("sec group"+rule.getGroup().getName());
//            System.out.println("From port"+rule.getFromPort());
//            System.out.println("To port"+rule.getToPort());tenants
//            }
//            Rule rule = os.compute().securityGroups().createRule(tenantsBuilders.secGroupRule().parentGroupId("fd91a56e-bee5-414f-b279-b3af570c47f8").protocol(IPProtocol.value("tcp"))
////				    .cidr("0.0.0.0/0")
//				    .range(15, 40).groupId("fd91a56e-bee5-414f-b279-b3af570c47f8").build()
//			       );
//            
//            System.out.println("rule1 is"+rule.getRange().getCidr());
//            System.out.println("rule1 is"+rule.getGroup().getName());
//            System.out.println("rule1 is"+rule.getParentGroupId());
//            System.out.println("rule1 is"+rule);tenants
//            
//            SecGroupExtension groups = os.compute().securityGroups().get("id");
//           Network network = os.networking().network().get(null);
            //server
//            ServerCreate sc = Builders.server().name("").flavor("").image("").networks(null).addSecurityGroup(groups.getName()).build();
//            ServerCreate sc = os.compute().servers().removeSecurityGroup(null, null);
//            List<? extends Image> imagelist = os.images().list();
//            for (Image openstackImage : imagelist) {
//            System.out.println("list"+openstackImage);
//            }
//            
//            // Create a Payload - we will use URL in this example
//            Payload<URL> payload = Payloads.create(new URL("http://cdn.download.cirros-cloud.net/0.3.2/cirros-0.3.2-x86_64-disk.img"));
//
//            Image image = os.images().create(Builders.image()
//                    .name("New image")
//                    .diskFormat(DiskFormat.VHD)
//                    .containerFormat(ContainerFormat.OVF)
//                    .minDisk(1l)    
//                    .minRam(512l)
//                    .isPublic(Boolean.TRUE)
//                    .build(), payload);
////            
//            Image image = os.images().get("0be82f23-4647-4d11-8fa4-d02ed0825554");
//            os.images().update(image.toBuilder().name("new vhd image").build());
//            Image imageUpdate = os.images().update(Builders.image()
//                    .id(null)
//                    .build());
//            List<? extends Image> list = os.images().list();
//            System.out.println("list"+list);
//            List<? extends FloatingIP> ips = os.compute().floatingIps().list();
//             System.out.println("ips list"+ips);
//            
//            
//            
//            List<? extends VolumeType> types = os.blockStorage().volumes().listVolumeTypes();
//           Flavor flavors = os.compute().flavors().get(null);
            // Suspend a Server
//            os.compute().servers().action("e5f7a218-8e65-4847-84c2-0651e6056ea6", Action.START);
//            os.compute().servers().action("sdfds", Action.STOP);
//            tenants
//
//            // Resume a Servertenants
//            os.compute().servers().delete("safds");
//            
//            System.out.println("ggggg");
//            
//           Server server1 = os.compute().servers().get("e5f7a218-8e65-4847-84c2-0651e6056ea6");
//           
//           System.out.println(server1);
//            System.out.println("server1" + server1);
//           os.compute().servers().delete("289fffa9-08f9-4914-8662-911d185ef91d");
//            os.useRegion("EastRegion");
//            List<? extends Server> eastServers = os.compute().servers().list();
//            System.out.println("east server"+ eastServers);
//             List<? extends Role> roles = os.identity().roles().list();
//             Role role = os.identity().roles().get("352a025e35a74d3ea71951d1fe569275");
//             System.out.println("roles:"+roles.size());
//              List<? extends User> users = os.identity().users().listTenantUsers("tenantId");
//            List<? extends User> users = os.identity().users().listTenantUsers("");  
//            List<? extends Tenant> tenants = os.identity().tenants().list();
//            System.out.println("tenants:"+tenants);
            //volume detachment
//            os.compute().servers().detachVolume("0f840707-e780-4a68-9e09-3100da01c7f0", "ed8056d0-37ee-4ce8-840a-255f18d456c6");
//              
//            VolumeAttachment volumeAttachment = os.compute().servers().attachVolume("", "");
//            VolumeAttachment volumeAttachment = os.compute().servers().attachVolume("202348b1-34fb-43fe-b9ea-e0336ff7d361","40cc8785-5351-4989-a75b-13fc2be21c71");
//            Volume volume = os.blockStorage().volumes().get("ed8056d0-37ee-4ce8-840a-255f18d456c6");
//            
//            for(VolumeAttachment attach : volume.getAttachments()) {
//                System.out.println(attach.getDevice());
//                System.out.println(attach.getHostname());
//                System.out.println(attach.getId());
//                System.out.println(attach.getServerId());
//                System.out.println(attach.getVolumeId());
//            }
            //resize
//            ActionResponse actionResponse = os.compute().servers().resize("d2be610e-aec6-471b-bee4-618825581520", "06a67fac-3793-40a9-8d7d-126b94816e1a");
//            os.compute().servers().confirmResize("d2be610e-aec6-471b-bee4-618825581520");
            //reboot
//            ActionResponse actionResponse;
//            actionResponse = os.compute().servers().reboot("9371d37f-90be-4104-bd7d-1ec973907339", RebootType.valueOf("HARD"));
//            
//            System.out.println("message"+actionResponse.isSuccess());
//            System.out.println("message"+actionResponse.getFault());
//            
//            //pause
//            os.compute().servers().action("", Action.LOCK);
            //power state
//             Server servers = os.compute().servers().get("9371d37f-90be-4104-bd7d-1ec973907339");
//             System.out.println("power State"+servers.getVmState());
            //actions
//             ActionResponse actionResponse = os.compute().servers().rebuild("9371d37f-90be-4104-bd7d-1ec973907339", RebuildOptions.create().image("ecf231c1-e624-4462-8f16-e4e7844c2ffe").name("Test-vm"));
////            
////             ActionResponse actionResponse = os.compute().servers().action("9371d37f-90be-4104-bd7d-1ec973907339", Action.valueOf("PAUSE"));
//             System.out.println("message"+actionResponse.isSuccess());
//            System.out.println("message"+actionResponse.getFault());
//            for(Service service :os.identity().services().list()) {
//                System.out.println("Service: " + service.getName());
//            }
//            System.out.println("Users: " + os.identity().users().list());
//            for(User user : os.identity().users().list()) {
//                System.out.println("user : " + user.getTenantId());
//            }
//            User updateUser = os.identity().users().get("135e4c4c04184b51b4633f293f585f01");
//            System.out.println("Roles: " + os.identity().roles().list());
//            System.out.println("tenants: " + os.identity().projects().get("4a6dcf583b3e413cbc962c04fc79314b").getName());
//            User user = os.identity().users().get("f2713df4cfb94395b3ee984e2223ee44");
//            
//            os.identity().users().update(user.toBuilder().email("testUser@fogpanel.com").build());
//user creation
//             User john = os.identity().users().get("b8fa6e7a6ee0465689dfc06609fded92");
//            os.identity().users().update(john.toBuilder().email("test@fogpanel.com").tenantId("7f1a2037541a417096914c9dfe613e1f").build());
//            Project project =os.identity().projects().create(Builders.project().domainId("default").name("test project abdul").description("test").enabled(true).build());
//            User user = os.identity().users().create(project.getId(),"test user abdul","password","testuser@fogpanel.com",true);
//              ActionResponse actionResponse = os.identity().projects().delete("ebd1804a9d304edc9d618a1aab82aa73");
//              System.out.println("res"+actionResponse.isSuccess());
//       ActionResponse actionResponse = os.identity().roles().addUserRole("82a9dd69f2d94b43a3f2ab4557ce386d", "2462a7cdf0cc4fdb9506364c4774bb8a", "352a025e35a74d3ea71951d1fe569275");
//       Role role = os.identity().roles().getByName("admin"); 
//       System.out.println("role id"+role.getId());
//            System.out.println("res"+actionResponse.isSuccess());
//            List <? extends Role> roles = os.identity().users().listRolesOnTenant("2462a7cdf0cc4fdb9506364c4774bb8a", "82a9dd69f2d94b43a3f2ab4557ce386d");
//            List <? extends Role> roles = os.identity().users().listRoles("2462a7cdf0cc4fdb9506364c4774bb8a");
//            
//            System.out.println("list role"+roles);
//            
//            Payload<URL> payload = Payloads.create(new URL("http://demo.fogpanel.com/ubuntu-13.10-server-i386.iso"));
////
//            Image image = os.images().create(Builders.image().name("new image for test").diskFormat(DiskFormat.valueOf("AKI")).isPublic(Boolean.TRUE)
//                    .minDisk(Long.getLong("0")).minRam(Long.getLong("0"))
//                    .owner("5070b365746b4e32a01120c665ee6ec2").build(), payload);
//            System.out.println("list"+os.compute().images().list());
//        
//            ServerCreate sc = Builders.server().name("test").image("04f9912e-1504-4d51-8310-acfae15efe3f")
//                              .build();
//            Keypair kp = os.compute().keypairs().create("default", null);
//            os.compute().flavors()
//                  .create("test flavor", 512, 1, 5, 0, 0,Float.NaN, true);
//            OpenStackServer server = new OpenStackServer("http://68.233.240.158:5000/v3", "d7a0494c3244414284e8181aa66a6059", "network", null);
//            
//            OSClient os = server.authenticate();
//            System.out.println(os.compute().flavors().list());
//            
//            KeystoneTokenV3 token = (KeystoneTokenV3) os.getAccess().getToken();
//            System.out.println(token.toString());
////            System.out.println("Catalog:" + token.getCatalog());
//            HashMap<String, Boolean> regions = new HashMap<>();
//            for (Catalog catalog : token.getCatalog()) {
//                System.out.println("type: " + catalog.getType());
//                for (EndpointV3 endpoint : catalog.getEndpoints()) {
//                    System.out.println("Region:" + endpoint.getRegion());
//                    System.out.println("id:" + endpoint.getId());
//                    System.out.println("id:" + endpoint.getURL());
//                    regions.put(endpoint.getRegion(), Boolean.TRUE);
//                }
//            }
//            List<? extends Keypair> keypairs ;
//            keypairs = os.compute().keypairs().list();
//            System.out.println("key list"+keypairs);
//            Network openstackNetwork = os.networking().network()
//                                .create(Builders.network().name("MyNetX").isShared(false).adminStateUp(true).build());
//            Network network = os.networking().network().get("e9019bf2-2006-4ef4-9afc-1eb85bb4f6d8");
//            List<? extends Server> vms = os.compute().servers().listAll(true);
//            for (Server vm : vms) {
//                System.out.println("power"+vm.getPowerState());
//            }
//            Subnet subnet = os.networking().subnet().create(Builders.subnet()
//                .name("test")
//                .network(os.networking().network().get("e9019bf2-2006-4ef4-9afc-1eb85bb4f6d8"))
//                .tenantId("756f3e9f96ee4eab94780282300296be")
//                .ipVersion(IPVersionType.V4)
//                .cidr("10.1.111.0/24")
//                .gateway(null)
//                .build());
//             os.networking().subnet().update("181dd4a9-6cbf-42f7-9e1c-3f416347aac3", "pragash update", "756f3e9f96ee4eab94780282300296be", "e9019bf2-2006-4ef4-9afc-1eb85bb4f6d8", "10.1.115.0/24", null, true, IPVersionType.V4);
//             Subnet subnet = os.networking().subnet().get("050f621d-3011-48f8-a1f6-68305e41364c");
//             subnet.setName("abdul update ");
//             os.networking().subnet().update(subnet.toBuilder().name("abdul update").enableDHCP(true).gateway("192.2.10.2").build());
//            List<? extends Subnet> subnets = os.networking().subnet().list();
//            System.out.println("subnet list "+subnets);
//            for (Subnet iterateSubnet : subnets) {
//                System.out.println("subnet tenent id"+iterateSubnet.getTenantId());
//                List<? extends Pool> pools = iterateSubnet.getAllocationPools();
//                for(Pool pool : pools) {
//                    System.out.println("start"+pool.getStart());
//                    System.out.println("end"+pool.getEnd());
//                    System.out.println("pool: "+"start "+pool.getStart()+" - End "+pool.getEnd());
//                }
//                System.out.println("subnet tenent id"+iterateSubnet.getAllocationPools().iterator().next().getStart());
//                String tenent = "756f3e9f96ee4eab94780282300296be";
//                if(iterateSubnet.getTenantId() == tenent) {
//                    System.out.println("true");
//                     System.out.println("subnet name"+iterateSubnet.getNetworkId());
//                     System.out.println("subnet name"+iterateSubnet.getCidr());
//                     System.out.println("subnet name"+iterateSubnet.getGateway());
//                     System.out.println("subnet name"+iterateSubnet.getDnsNames());
//                     System.out.println("subnet name"+iterateSubnet.isDHCPEnabled());
//                } 
//            }
//            List<? extends Network> networks = os.networking().network().list();
//            System.out.println("networks"+networks);
//            
//            for(Network network : networks) {
//                System.out.println("tenent id"+network.getTenantId());
//                if(network.getTenantId() == "756f3e9f96ee4eab94780282300296be") {
////                    System.out.println("true");
//                }
//            }
//            os.networking().port().create(Builders.port()
//                    .tenantId("756f3e9f96ee4eab94780282300296be")
//                    .networkId("e8753a89-9fd8-495e-8353-b138b551bb0f")
//                    .adminState(true)
//                    .fixedIp("192.2.12.0" ,"b98c5279-7486-4a5d-8ecc-49742b96311f" )
//                    .deviceId(null)
//                    .macAddress("")
//                    .name("")
//                    .build());
//            List<? extends Port> port = os.networking().port().list();
//            System.out.println("port"+port);
//            System.out.println("list network"+os.networking().network().delete("d3e11eca-e654-4039-a6e1-e3d002ae9b78"));
//            SecGroupExtension securityGroup = os.compute().securityGroups().create("security test", "des");
//            Volume volume = os.blockStorage().volumes()
//                .create(Builders.volume()
//                    .name("test volume new")
//                    .description("des")
//                    .size(1)
//                    .build()
//                );
//            List<String> networks = new ArrayList<String>();
//           
//            networks.add("761706b3-2207-46f4-9aae-7b6ab130c93d");
//             Subnet subnet = os.networking().subnet().get("5fb5cbaf-fa5d-4785-a4fe-0d9dd2ddb020");
//             Subnet newtronSubnet = new NeutronSubnet();
//             newtronSubnet.setId("5fb5cbaf-fa5d-4785-a4fe-0d9dd2ddb020");
//             newtronSubnet.setName("Test 333");
//             newtronSubnet.setTenantId("756f3e9f96ee4eab94780282300296be");
//            os.networking().subnet().update(subnet.toBuilder()
//                    .name("test 4")
//                    .build());
//            os.networking().subnet().update(newtronSubnet);
//            
//            ServerCreate sc = Builders.server()
//                          .name("Ubuntu 2")
//                          .flavor("1")
//                          .image("04f9912e-1504-4d51-8310-acfae15efe3f")
//                          
//                    .blockDevice(null)
//                          .addPersonality("/etc/motd", "Welcome to the new VM! Restricted access only")
//                          .build();
////            
//         Server servers = os.compute().servers().boot(sc);
//            List<? extends Server> vms = os.compute().servers().listAll(true);
//
//            for (Server server1 : vms) {
//                Map<String, List<? extends Address>> address = server1.getAddresses().getAddresses();
////
//                System.out.println("size" + address.entrySet().isEmpty());
//                if(!address.isEmpty()) {
//                    if(address.entrySet().isEmpty()) {
//                        
//                    }
//                }
//                }
//
//            }
//            Keypair kp = os.compute().keypairs().create("7f1a2037541a417096914c9dfe613e1f", "gowtham ssh-test", null);
//                                  
//            Project project = os.identity().projects().create(Builders.project().domainId("default").name("gowtham default").enabled(true).build());
//
//            User openstackUser = os.identity().users().create(Builders.user().tenantId(project.getId()).name("gowtham default").
//                    password("gowtham").email("gowtham@gmail.com").enabled(true).build());
//                                            
//            Role currentRole = os.identity().roles().getByName(""); 
//////
//////                        
//            os.identity().roles().addUserRole(project.getId(), openstackUser.getId(), "9fe2ff9ee4384b1894a90878d3e92bab");
//                        
//            System.out.println("os"+os.compute().keypairs().list());
//            
//            Network openstackNetwork = os.networking().network()
//            .create(Builders.network().name("Abdul-test network").adminStateUp(true).build());
////            
//            Subnet subnet = os.networking().subnet().create(Builders.subnet()
//                .name("subnet")
//                .network(openstackNetwork)
//                .ipVersion(IPVersionType.V4)
//                .cidr("192.2.2.12/12")
//                .gateway("192.2.2.2")
//                .build());
//              Keypair kp = os.compute().keypairs().create("abdul", null);
//            ActionResponse actionResponse = os.compute().keypairs().delete("test");
//            System.out.println("actionResponse : "+actionResponse.isSuccess());
//            System.out.println("actionResponse : "+actionResponse.getFault());
//             
//             List<? extends Keypair> list = os.compute().keypairs().list();
//             System.out.println("Keypair list: "+list);
        } catch (AuthenticationException ex) {
            System.out.println(ex);
        } catch (Exception e) {
            e.printStackTrace(System.err);
        }

    }

}
