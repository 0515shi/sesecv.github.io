const userName = document.getElementById("inputName");
const userEmail = document.getElementById("inputEmail");
const userInquiry = document.getElementById("inputInquiry");

async function submitInfo(){

    // console.log(userName.value);
    // console.log(userEmail.value);
    // console.log(userInquiry.value);

    if(userName.value == "" || userEmail.value == "" || userInquiry.value == ""){
        return console.log("Input is null.");
    }else{
        let formData = new URLSearchParams({
        name: userName.value,
        email: userEmail.value,
        inquiry: userInquiry.value
    })


    const responseFromBackend = await fetch("http://localhost:8080/user/contactMeInfo",{ // input backend link
        method: 'POST',
        headers: {'Content-Type': 'application/x-www-form-urlencoded'},
        body: formData,
        // credentials: 'include'
    });

    console.log(responseFromBackend);

    return await responseFromBackend.json(); // convert to JSON format
    }



    
    
    
    
}

