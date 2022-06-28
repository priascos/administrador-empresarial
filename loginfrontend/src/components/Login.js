import React, { useState } from 'react';
import swal from 'sweetalert';
// import React,  { usesState } from 'react';

// export default App;
// export default function App(){
//   const[nombre,setNombre]=usesState('')
//   const[contrasena,setContrsena]=usesState('')
// }


export default function App() {
  const[nombre,setNombre]=useState('');
  const[contrasena,setContrasena]=useState('')
  const mostrarEmpresas=()=>{
    swal({title:"Listado de empresas.",
    text:"ACA LISTA EMPRESAS"
    }).then(respuesta=>{
        if(respuesta){
            handleClick(respuesta);
        }
    })
    }
  
const handleClick=()=>{
const login={nombre,contrasena}
console.log(login)
fetch("http://localhost:8080/usuarios/add",{
    method:"POST",
    headers:{"Content-Type":"application/json"},
    body:JSON.stringify(login)

}).then(()=>{
    console.log("New Student added")
})
}

  return (
    <div className="App">
      <div class="container">
        <div class="screen">
          <div class="screen__content">
            <form class="login">
              <div class="login__field">
                <i class="login__icon fas fa-user"></i>
                <input type="text" class="login__input" placeholder="Nombre de usuario" 
                value={nombre} 
                onChange={(e)=>setNombre(e.target.value)}
                />
              </div>
              <div class="login__field">
                <i class="login__icon fas fa-lock"></i>
                <input type="password" class="login__input" placeholder="Contraseña" 
                value={contrasena} 
                onChange={(e)=>setContrasena(e.target.value)}
                />
              </div>
              <button class="button login__submit" onClick={()=>mostrarEmpresas()} type="button">
                <span class="button__text">Login</span>
                <i class="button__icon fas fa-chevron-right"></i>
              </button>				
            </form>
            {/* {nombre}
            {handleClick}
            {contrasena} */}
            {/* <div class="social-login">
              <h3>log in via</h3>
              <div class="social-icons">
                <a href="#" class="social-login__icon fab fa-instagram"></a>
                <a href="#" class="social-login__icon fab fa-facebook"></a>
                <a href="#" class="social-login__icon fab fa-twitter"></a>
              </div>
            </div> */}
          </div>
          <div class="screen__background">
            <span class="screen__background__shape screen__background__shape4"></span>
            <span class="screen__background__shape screen__background__shape3"></span>		
            <span class="screen__background__shape screen__background__shape2"></span>
            <span class="screen__background__shape screen__background__shape1"></span>
          </div>		
        </div>
      </div>
    </div>
  );
}


