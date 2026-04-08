const userName = document.getElementById("inputName");
const userEmail = document.getElementById("inputEmail");
const userInquiry = document.getElementById("inputInquiry");

async function submitInfo(){

    let formData = new URLSearchParams({
        name: userName,
        email: userEmail,
        userInquiry: userInquiry
    })

    console.log(formData);

    const responseFromBackend = await fetch("",{ // input backend link
        method: 'POST',
        headers: {'Content-Type': 'application/x-www-form-urlencoded'},
        body: formData
    });

    
    
    return await responseFromBackend.json(); // convert to JSON format
    
    
    // console.log(userName);
    // console.log(userEmail);
    // console.log(userInquiry);
}

