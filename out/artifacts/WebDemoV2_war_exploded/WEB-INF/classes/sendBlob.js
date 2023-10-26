import axios from 'axios'
axios.defaults.baseURL = "http://localhost:8081"
Vue.prototype.$http = axios

async function send_blob(){
    alert("send_blob")
    this.$http.post(
        "/webdemo/helloworld"
    ).then(function(resp){
       alert(resp)
    }).catch(function(err){
       alert(err)
    });
}

function click_1(){
    console.log("hello world!")
    alert("hello world")
}