/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.openstack.apitest;


import java.io.IOException;

public class HttpDownloader {

	public static void main(String[] args) {
		String fileURL = "http://sourceforge.net/projects/urlimagedownloader/files/latest/download";
		String saveDir = "/home/lakshmi/Desktop";
		try {
			HttpDownloadUtility.downloadFile(fileURL, saveDir);
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}
}
