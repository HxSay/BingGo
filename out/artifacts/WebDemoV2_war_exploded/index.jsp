<%--
  Created by IntelliJ IDEA.
  User: leiqinghua
  Date: 2022/11/25
  Time: 10:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

  <head>
    <title>$Title$</title>
  </head>
  <body>
    <script src="https://unpkg.com/axios@1.2.0/dist/axios.min.js"></script>
    <script>
      function click_1(){
        console.log("hello world!")
        alert("hello world")
      }
      axios.defaults.baseURL = "http://localhost:8081"
      function hello_world(){
        axios({
          method: "post",
          url: "http://localhost:8081/webdemo/helloworld"
          }
        ).then(function(resp){
          console.log(resp.data)
        }).catch(function(err){
          alert(err)
        });
      }

      function send_blob1(){
        const blob = new Blob(["helloworld"], {
          type: 'text/plain'
        });
        var fromData = new FormData();
        fromData.append("file",blob)
        axios({
          method: "post",
          url: "http://localhost:8081/webdemo/sendBlob1",
          headers: {"Content-Type": "multipart/form-data"},
          data: fromData
        }).then(function (resp){
          console.log(resp.data)
        }).catch(function (error){
          alert(error)
        })
      }

      function send_blob2(){
        const blob = new Blob(["helloworld"], {
          type: 'text/plain'
        });
        var fromData = new FormData();
        fromData.append("stream",blob)
        axios({
          method: "post",
          url: "http://localhost:8081/webdemo/sendBlob2",
          headers: {"Content-Type": "application/json"},
          data:{
            dat: "send_blob",
            stream: fromData
          }
        }).then(function (resp){
          console.log(resp.data)
        }).catch(function (error){
          alert(error)
        })
      }

      function blobToDataURI(blob, callback) {
        var reader = new FileReader();
        reader.readAsDataURL(blob);
        reader.onload = function (e) {
          callback(e.target.result);
        }
      }

      async function send_blob_base64(){
        const blob = new Blob(["hello world!"], {
          type: 'text/plain'
        });
        console.log("blob text:"+await blob.text())
        console.log("blob arrayBuffer:"+await blob.arrayBuffer())

        blobToDataURI(blob,function (res){
          axios({
            method: "post",
            url: "http://localhost:8081/webdemo/sendBlobBase64",
            headers: {"Content-Type": "application/json"},
            data:{
              dat: "send_blob_base64",
              stream: res
            }
          }).then(function (resp){
            console.log(resp.data)
          }).catch(function (error){
            alert(error)
          })
        })

      }

      async function send_blob_bytes(){
        const blob = new Blob(["hello world!"], {
          type: 'text/plain'
        });
        var bytes = await blob.arrayBuffer()
        console.log("blob text:"+await blob.text())
        console.log("blob arrayBuffer:"+await blob.arrayBuffer())
        blobToDataURI(blob,function (res){
          axios({
            method: "post",
            url: "http://localhost:8081/webdemo/sendBlobbytes",
            headers: {"Content-Type": "application/json"},
            data:{
              dat: "send_blob_base64",
              stream: res,
              streamb: bytes
            }
          }).then(function (resp){
            console.log(resp.data)
          }).catch(function (error){
            alert(error)
          })
        })
      }

    </script>

    <script>
      $(function(){
        $("#image").click(function(){
          $("#uploadfile").click();
        })
        $("#uploadfile").change(function(){

          var files=$(this)[0].files[0];    //获取文件信息
          if(files)
          {
            var reader=new FileReader();  //调用FileReader
            reader.onload=function(evt){   //读取操作完成时触发。
              $("#image").attr('src',evt.target.result)  //将img标签的src绑定为DataURL
            }
            reader.readAsDataURL(files); //将文件读取为 DataURL(base64)
          }
          else{
            alert("上传失败");
          }
        })
      })
    </script>

    <div class="img-box">
      <input type="file"  style="display:none" id="uploadfile" accept="image/*"/>
      <img src="img/img.png" id="image" >
    </div>

    <input type="button" id="btn1" onclick="click_1()" value="hello world!">
    <input type="button" id="btn2" onclick="hello_world()" value="hello_world">
    <input type="button" id="btn3" onclick="send_blob1()" value="send_blob1">
    <input type="button" id="btn4" onclick="send_blob2()" value="send_blob2">
    <input type="button" id="btn5" onclick="send_blob_base64()" value="send_blob_base64">
    <input type="button" id="btn6" onclick="send_blob_bytes()" value="send_blob_bytes">

  </body>
</html>
