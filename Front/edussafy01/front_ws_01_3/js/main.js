// function init(hide) {
//   let post_logins = document.querySelectorAll(".post-login");
//   for (let item of post_logins) {
//     item.style.display = hide?"none":"block"
//   }
//   document.querySelectorAll(".pre-login").forEach(function(item){
//     item.style.display=hide?"block":"none"
//   })
// }

// init(true);

// document.querySelector("#a-login").addEventListener("click", function(){
//     let id = window.prompt("아이디 입력");
//     let pass = window.prompt("비밀번호 입력");
//     if(id=='ssafy' && pass=='1234'){
//         alert("로그인 성공");
//         init(false);
//     }else{
//         alert("아이디/비번을 확이나세용.")
//     }
// })

// document.querySelector("#a-logout").addEventListener("click", function(){
//     init(true)
// });

// let areas = document.querySelectorAll(".store_area");
// for(let area of areas){
//     let next = area.querySelector(":scope + div")
//     console.log(next)
// }