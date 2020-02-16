package com.sabzi_bazzer;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.ResultSet;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.Part;
public class Test_helper {
    
    public static List<String> uploadFile(String UPLOAD_DIR, HttpServletRequest request,String name) {
		List<String> fileNames = new ArrayList<String>();
		try {
			List<Part> parts = (List<Part>) request.getParts();
			for (Part part : parts) {
				if (part.getName().equalsIgnoreCase(name)) {
					String fileName = getFileName(part);
                                        String ext=fileName.substring(fileName.lastIndexOf('.'), fileName.length());
                                        Date date= new Date();
                                        long time = date.getTime();
                                        fileName=String.valueOf(time)+ext;
					fileNames.add(fileName);
					String applicationPath = request.getServletContext().getRealPath("");
					String basePath = applicationPath + File.separator + UPLOAD_DIR + File.separator;
                                     
					InputStream inputStream = null;
					OutputStream outputStream = null;
					try {
						File outputFilePath = new File(basePath + fileName);
						inputStream = part.getInputStream();
						outputStream = new FileOutputStream(outputFilePath);
						int read = 0;
						final byte[] bytes = new byte[1024];
						while ((read = inputStream.read(bytes)) != -1) {
							outputStream.write(bytes, 0, read);
						}
					} catch (Exception ex) {
						fileName = null;
					} finally {
						if (outputStream != null) {
							outputStream.close();
						}
						if (inputStream != null) {
							inputStream.close();
						}
					}
				}
			}
		} catch (Exception e) {
			fileNames = null;
		}
                
		return fileNames;
	}

	private static String getFileName(Part part) {
		for (String content : part.getHeader("content-disposition").split(";")) {
			if (content.trim().startsWith("filename")) {
				return content.substring(content.indexOf('=') + 1).trim().replace("\"", "");
			}
		}
		return null;
	}

 public static List<String> uploadFileSeller(String UPLOAD_DIR, HttpServletRequest request,String name,String email) {
		List<String> fileNames = new ArrayList<String>();
		try {
			List<Part> parts = (List<Part>) request.getParts();
			for (Part part : parts) {
				if (part.getName().equalsIgnoreCase(name)) {
					String fileName = getFileName(part);
                                       // String ext=fileName.substring(fileName.lastIndexOf('.'), fileName.length());
                                       String ext=".jpg";
                                        ResultSet rs = new Database().Sellerprofilepic(email);
                                        String fpath="";
                                        if(rs.next())
                                        {
                                           fpath = rs.getString("seller_id");
                                        }
                                        fileName=String.valueOf(fpath)+ext;
					fileNames.add(fileName);
					String applicationPath = request.getServletContext().getRealPath("");
					String basePath = applicationPath + File.separator + UPLOAD_DIR + File.separator;
                                     
					InputStream inputStream = null;
					OutputStream outputStream = null;
					try {
						File outputFilePath = new File(basePath + fileName);
						inputStream = part.getInputStream();
						outputStream = new FileOutputStream(outputFilePath);
						int read = 0;
						final byte[] bytes = new byte[1024];
						while ((read = inputStream.read(bytes)) != -1) {
							outputStream.write(bytes, 0, read);
						}
					} catch (Exception ex) {
						fileName = null;
					} finally {
						if (outputStream != null) {
							outputStream.close();
						}
						if (inputStream != null) {
							inputStream.close();
						}
					}
				}
			}
		} catch (Exception e) {
			fileNames = null;
		}
                
		return fileNames;
	}
  public static List<String> uploadFileUSer(String UPLOAD_DIR, HttpServletRequest request,String name,String email) {
		List<String> fileNames = new ArrayList<String>();
		try {
			List<Part> parts = (List<Part>) request.getParts();
			for (Part part : parts) {
				if (part.getName().equalsIgnoreCase(name)) {
					String fileName = getFileName(part);
                                       // String ext=fileName.substring(fileName.lastIndexOf('.'), fileName.length());
                                       String ext=".jpg";
                                        ResultSet rs = new Database().Userprofilepic(email);
                                        String fpath="";
                                        if(rs.next())
                                        {
                                           fpath = rs.getString("user_id");
                                        }
                                        fileName=String.valueOf(fpath)+ext;
					fileNames.add(fileName);
					String applicationPath = request.getServletContext().getRealPath("");
					String basePath = applicationPath + File.separator + UPLOAD_DIR + File.separator;
                                     
					InputStream inputStream = null;
					OutputStream outputStream = null;
					try {
						File outputFilePath = new File(basePath + fileName);
						inputStream = part.getInputStream();
						outputStream = new FileOutputStream(outputFilePath);
						int read = 0;
						final byte[] bytes = new byte[1024];
						while ((read = inputStream.read(bytes)) != -1) {
							outputStream.write(bytes, 0, read);
						}
					} catch (Exception ex) {
						fileName = null;
					} finally {
						if (outputStream != null) {
							outputStream.close();
						}
						if (inputStream != null) {
							inputStream.close();
						}
					}
				}
			}
		} catch (Exception e) {
			fileNames = null;
		}
                
		return fileNames;
	}
}
