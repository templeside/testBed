// const loginForm = document.querySelector("#login-form");
// const loginInput = loginForm.querySelector("#login-form input");
// const loginButton = loginForm.querySelector("#login-form button");
// const HIDDEN_CLASSNAME = "hidden";

// function onLoginSubmit(){
//     console.dir(loginInput);
//     console.log(loginInput.value);
//     event.preventDefault();

//     loginForm.classList.add(HIDDEN_CLASSNAME); // class를 hidden클래스로 바꾸어
//     const username = loginInput.value;         // css class를 통해 사라지게 하기
//     greeting.innerText = "Hello " + username;
//     greeting.classList.remove(HIDDEN_CLASSNAME); // 새로운 창은 hidden 지우기
// }

// loginButton.addEventListener("click", onLoginSubmit);

const greetingForm = document.getElementById('greeting-form');
const greetingMessage = document.getElementById('greeting-message');

greetingForm.addEventListener('submit', function(e) {
  e.preventDefault();

  const name = document.getElementById('name').value;
  const color = document.getElementById('color').value;

  if (name && color) {
    greetingMessage.textContent = `Hello, ${name}! I see your favorite color is ${color}.`;
    greetingMessage.style = "color:"+color;
  } else {
    greetingMessage.textContent = 'Please enter your name and select a color.';
  }

});
