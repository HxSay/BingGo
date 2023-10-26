package fastdfs;

import org.csource.common.NameValuePair;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;

public class StartApp {
    public static void main(String[] args) {
//        fileUpload();
//        fileDownload();
        getFileInfo();
    }

    public static void fileUpload(){
        File file = new File("/Users/leiqinghua/Downloads/dog.jpg");
        String[] strings = FastDFSConfig.uploadFile(file,file.getName());
        System.out.println("fileUpload success: "+ Arrays.asList(strings));
    }

    public static void fileDownload(){
        try {
            InputStream img = FastDFSConfig.downloadFile("group1","M00/00/00/CgAAA2OrnVSACkslAABFZMeIvcI916.jpg");
            OutputStream outputStream = new FileOutputStream(new File("/Users/leiqinghua/Downloads/dog-copy.ipg"));
            int index = 0;
            while ((index = img.read()) != -1){
                outputStream.write(index);
            }
            outputStream.flush();
            outputStream.close();
            img.close();
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void getFileInfo(){
        NameValuePair[] nameValuePairs = FastDFSConfig.getMetaDate("group1","M00/00/00/CgAAA2OrnVSACkslAABFZMeIvcI916.jpg");
        if (nameValuePairs!=null && nameValuePairs.length>0){
            for (NameValuePair pair: nameValuePairs) {
                System.out.println(pair);
            }
        }
    }
}
