/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.az.openstack;

import org.openstack4j.api.OSClient;
import org.openstack4j.api.types.Facing;
import org.openstack4j.model.common.Identifier;
import org.openstack4j.openstack.OSFactory;
import org.openstack4j.openstack.identity.domain.v3.KeystoneAuth;

/**
 *
 * @author gowtham
 */
public class OpenStackServer {
    
    
    private String endpoint;
    private String username;
    private String password;
    private String domainName;
    private String projectName;
    
    /**
     * Creates a new Server Instance that could connect to the openstack , with the provided details
     * 
     * @param endpoint
     * @param username
     * @param password
     * @param domainName 
     * @param projectName 
     */
    public OpenStackServer(String endpoint, String username, String password, String domainName, String projectName) {
        this.endpoint = endpoint;
        this.username = username;
        this.password = password;
        this.domainName = domainName;
        this.projectName = projectName;
    }
    
    /**
     * Authenticate user to OpenStack server
     * 
     * @return  
     */
    public OSClient authenticate() {
        
        OSClient os;
        
        String url = endpoint;
        int slashEndPosition = url.lastIndexOf("/");
            
        String str = url.substring(slashEndPosition + 1, url.length());
        
        int dotPosition = str.lastIndexOf(".");
        
        String openStackVersion = "";
        
        if(dotPosition != -1) {
            openStackVersion = str.substring(0, dotPosition);
        }
        
        
        if(projectName != null && !projectName.isEmpty()) {
        
            //V3 authentication
            if(domainName != null && !domainName.isEmpty()) {
                System.out.println("V3 support");
                os = OSFactory.builderV3()
                    .endpoint(endpoint)
                    .credentials(username, password) 
                    .scopeToProject(Identifier.byName(projectName), Identifier.byName(domainName))
                    .authenticate();

            } else {
                //V2 authentication
                System.out.println("V2 support");
                os = OSFactory.builder()
                    .endpoint(endpoint)
                    .credentials(username, password)
                    .tenantName(projectName)
                        .perspective(Facing.ADMIN)
    //                .scopeToProject(Identifier.byName(projectName), Identifier.byName(domainName))
                    .authenticate();
            }
 
        } else {
            System.out.println("Without project ");
            
            if(openStackVersion.equals("v3")) {
                System.out.println("version three");
                os = OSFactory.builderV3()
                .endpoint(endpoint)
                .credentials(username, password) 
                .authenticate();
            } else {
                System.out.println("version two");
                os = OSFactory.builder()
                .endpoint(endpoint)
                .credentials(username, password) 
                .perspective(Facing.ADMIN)
                .authenticate();
            }
            
        }
                
         
        
//        KeystoneAuth os  = new KeystoneAuth("90fd2e5cebf6499e8b23516a0864be72", "password",null,"default", "Gowtham");
             
        return os;
    }
    
}
