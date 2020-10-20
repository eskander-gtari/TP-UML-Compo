document.getElementById('form1').addEventListener('submit',function(u){
    let firstName=document.getElementById('nom');
    let regFirst =/^[a-zA-Z-\s]+$/;
    if(firstName.value.trim()==""){
      let error=document.getElementById('erreur');
      error.innerHTML="le champs firstName est requis";
      error.style.color='red';    
    u.preventDefault();
    }else if(regFirst.test(firstName.value)==false){
     let error=document.getElementById('erreur');
      error.innerHTML="le nom doit comporter des lettres et des tirets uniquement";
      error.style.color='red';    
      u.preventDefault();   
    }else{
        alert('Formulaire envoyé');
    }
});