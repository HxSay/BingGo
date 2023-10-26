package video;
import org.apache.tomcat.util.codec.binary.Base64;

import java.io.FileOutputStream;


public class Video {
    static String  filePath = "/Users/leiqinghua/1.mkv";
    public static void main(String[] args) {
        try{
            byte[] bytes = blobBase64ToBytes(BlobBean.getBase64Blob());
            saveVideo(filePath,bytes);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static byte[] blobBase64ToBytes(String blobBase64){
        if(blobBase64==null || blobBase64.isEmpty()){
            return null;
        }
//        String videoStr = blobBase64;
        String videoStr = blobBase64.substring(blobBase64.lastIndexOf(",")+1);
        if(videoStr.isEmpty()){
            return null;
        }
        byte[] decodedBytes = Base64.decodeBase64(videoStr);
        String decodedStr = new String(decodedBytes);
        return decodedBytes;
    }

    public static void saveVideo(String filePath, byte[] videoStream) throws Exception{
        FileOutputStream fos = null;
        try{
            fos = new FileOutputStream(filePath,true);
            fos.write(videoStream);
        }catch (Exception e){
            e.printStackTrace();
            throw new RuntimeException(e.getMessage());
        }finally {
            if(fos!=null){
                try{
                    fos.close();
                }catch (Exception e){

                }
            }
        }
    }
}
