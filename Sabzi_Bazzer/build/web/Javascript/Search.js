/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
function search()
{
    let search=document.getElementById("search").value;
    if(search=="")
    {
        alert("Enter the Search Value");
        return false;
    }
    return true;
}