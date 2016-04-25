/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.openstack.apitest;

import java.io.File;
import java.net.URI;
import java.net.URL;
import java.net.URLEncoder;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Formatter;
import java.util.Map;
import static javax.xml.transform.OutputKeys.ENCODING;
import org.apache.commons.codec.binary.StringUtils;
import org.openstack4j.model.common.Payloads;
import org.openstack4j.model.storage.object.options.ObjectPutOptions;

/**
 *
 * @author gowtham
 */
public class openstackHttpclient {

    public static void main(String[] args) {

        try {
            
            //List to String
            
//            List myList = new ArrayList();
//            myList.add("english");
//            myList.add("spanish");
//            myList.add("german");
//            
//            System.out.println("myList: "+myList);
//            StringBuilder sb = new StringBuilder();
//
//            for (Object obj : myList) {
//              sb.append(obj.toString());
//              sb.append("\t");
//            }
//            
//            myList.toString().replaceAll("\\[|\\]", "").replaceAll(", ","\t");
//            
//            System.out.println("myList.toString(): "+sb);
//            
//            DateFormat formater = new SimpleDateFormat("dd/MM/yyyy");
//            
//            DateFormat formater2 = new SimpleDateFormat("dd MMM YYYY H:mm:ss");
//            DateFormat formater3 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ");
//            
//
//            
            Calendar cal = Calendar.getInstance();
            
            System.out.println("dkmdSDZsdd: "+new Date());
            
            ArrayList<HashMap> firstarr = new ArrayList<HashMap>();
            HashMap map = new  HashMap();
            map.put("first", "1");
            map.put("second", "2");
            map.put("third", "3");
            firstarr.add(map);
            ArrayList secondarr = new ArrayList();
            HashMap map2 = new  HashMap();
            map2.put("four", "4");
            map2.put("five", "5");
            map2.put("six", "6");
            secondarr.add(map2);
            secondarr.add(firstarr);

            ArrayList<ArrayList> chargeBackResponse = new ArrayList<ArrayList>();
            chargeBackResponse.add(firstarr);
            chargeBackResponse.add(secondarr);
            System.out.println("chargeBackResponse: "+chargeBackResponse);
    
//            Calendar cal = Calendar.getInstance();
//      Formatter  fmt = new Formatter();
//      fmt.format("%tB %tb %tm", cal, cal, cal);
//      System.out.println("sddsds: "+fmt);
            
//            String language = "pt_PT";
//
//            String[] re = language.split("_");
//            String prfeix = re[0];
//            String suffix = re[1];
//            System.out.println("re: "+re[0]);
//            System.out.println("re: "+re[1]);
//            
//            
//            System.out.println("formater: "+formater2.format(formater3.parse("2016-02-08T15:09:34+0530")));
            
//            System.out.println("formater: "+DateFormat.getDateInstance().format("1454869800000"));

//            String str = new String("images/tre/");
//            String str = new String("http://68.233.240.159:5000/v3");
//            
//            int position = str.lastIndexOf(":");
//            
//            System.out.println("position: "+position);
//            
//            String str1 = str.substring(0, position);
//            
//            System.out.println("str1: "+str1);
//            String name = "";
            
//            String str = "http://localhost:7070/FogPanel/#/user/volume/list";
//            
//            int leng = str.length();
//            
//            String str1 = "http://localhost:7070/FogPanel/";
//            
//            int leng2 = str1.length();
            
//            String encodeStr = URLEncoder.encode("Frick&Frack", ENCODING);
//            String encodeStr = java.net.URLEncoder.encode("asvd sdsds", "ISO-8859-1");
              String s = "http://192.168.1.181:5000/v2.0";
            
//              int i = s.lastIndexOf("/");  
//              System.out.println(""+s.lastIndexOf("/"));
//              System.out.println(""+s.substring(0, i+1));
            
//            System.out.println("encodeStr: "+s.replace(" ", "%20"));
            
//              SimpleDateFormat format = new SimpleDateFormat("yyyy.MM.dd HH:mm");
//Calendar cal = Calendar.getInstance();
//cal.add(Calendar.MONTH, -1);
//cal.set(Calendar.DAY_OF_YEAR, 1);
//cal.set(Calendar.HOUR_OF_DAY, 00);
//        cal.set(Calendar.MINUTE, 00);
//        cal.set(Calendar.SECOND, 00);
//        cal.set(Calendar.MILLISECOND, 00); 
//
//            System.out.println("week: "+cal.getTime().getMonth());
//            System.out.println("week: "+cal);
            
//              String s1 = String.format("/%s/%s", "test", "test2 23/asw");
//              
//              System.out.println("s1: "+s1);
//              System.out.println("len: "+s.length());
////            
//            int slashEndPosition = s.lastIndexOf("/");
//            
//            String str = s.substring(slashEndPosition + 1, s.length());
//            
//            
//            
//            int dotPosition = str.lastIndexOf(".");
//            
//            System.out.println("dotPosition: "+dotPosition);
//            
//            String version = str;
//            
//            if(dotPosition != -1) {
//                version = str.substring(0, dotPosition);
//            }
//            
//            System.out.println("version: "+version);
//            System.out.println("pos: "+slashEndPosition);
//            System.out.println("str: "+str);
//            System.out.println("str: "+s.substring(0, slashEndPosition-1));
            
            
//            System.out.println("pos: "+slashEndPosition);
//            if(str.length()-1 == slashEndPosition) {
//                System.out.println("true-");
//            }
//            int length = str.length();
//            System.out.println("position: "+position);
//            System.out.println("length: "+length);
//            if(position == length-1) {
//                System.out.println("str--"+str.substring(0, position));
//            } else {
//                System.out.println("full"+str);
//            }
            
//            String urlStr = "http://abc.dev.domain.com/0007AC/ads/abc domain";
//            URL url = new URL(urlStr);
//            URI uri = new URI(url.getProtocol(), url.getUserInfo(), url.getHost(), url.getPort(), url.getPath(), url.getQuery(), url.getRef());
//            url = uri.toURL();
////            
//            System.out.println("url: "+url);
            
//            String str = "abcd.pdf";
            
//            int position = str.lastIndexOf(".");
//            
//            String ext = str.substring(position);
//            
//            System.out.println("ext: "+ext);
            
            
//            File file = new File("/home/lakshmi/Desktop/keystone.pdf");
////            
//            Map<String, String> map = new HashMap<String, String>();
////            map.put("Content-Type", "application/pdf");
//            map.put("name", "keystone.pdf");
//////////            
//             String checkSum = os.objectStorage().objects().put("container1", "keystone1", Payloads.create(file), ObjectPutOptions.create().contentType("application/pdf").metadata(map));
//             System.out.println("checkSum: "+checkSum);
// 
//            
//            Map<String, String> md = os.objectStorage().objects().getMetadata("container1", "keystone1");
////            
//            System.out.println("md: "+md);
            
//            
//            if(position == length-1) {
//                name = str;
//            } else {
//                name = str + "/";
//            }
//            System.out.println("name: "+name);
//            String line = "Today is Monda "; //count number of "a" on this String.

            //Using Spring framework StringUtils class for finding occurrence of another String
//            int count = line.length() - line.replace("/", "").length();

//            System.out.println("count" + count);

//    String Str = new String("images/tre");
//      
//      String name = "";
////      
//      if(Str.indexOf("/") != -1) {
//          String[] split = Str.split("/");
//          int splitSize = split.length;
//          System.out.println("size: "+splitSize);
//          
//          for(int i=0; i< splitSize; i++) {
//              name = split[splitSize-1];
//              System.out.println("name: "+name);
//          }
//      }
            
//            var VerticalMenuBar = new FogPanel.VerticalMenuBar({
//                   id : "userVerticalMenuBarWidget"
//               }).placeAt("userVerticalMenuBar");  
//               var currentUrl = window.location.hash;
//               var position = currentUrl.lastIndexOf(currentUrl)
//               var serverUrl = currentUrl.substring(0, position);
//               
//               if(serverUrl == "#/user/server/add") {
//                   VerticalMenuBar.subscribe("#/user/server/list"); 
//               } else {
//                   VerticalMenuBar.subscribe("/FogPanel/event/route/changed");  
//               }
//                     
//               VerticalMenuBar.populateMenu(menuContainer);
        } catch (Exception e) {
            e.printStackTrace(System.err);
        }

    }
}
