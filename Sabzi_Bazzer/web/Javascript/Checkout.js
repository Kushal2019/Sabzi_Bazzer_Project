/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
function Checkout()
{
    let address = document.getElementsByName("Address");
    let payment=  document.getElementsByName("Payment");
    for(let i=0;i<address.length;i++)
    {
        if(address[i].checked==false)
        {
            alert("Choose Address");
        }
    }
}




