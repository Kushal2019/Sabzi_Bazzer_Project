function product_val() {
   let product_name, product_file, product_quantity, product_quantity_type, product_price, product_Expdate, product_desc, f = 1;
   product_name = document.getElementById("product_name");
   product_file = document.getElementById("product_file");
   product_quantity = document.getElementById("product_quantity");
   product_quantity_type = document.getElementById("product_quantity_type");
   product_price = document.getElementById("product_price");
   product_Expdate = document.getElementById("product_Expdate");
   product_desc = document.getElementById("product_desc");
   if (product_name.value === "") {
      document.getElementById("e1").innerHTML = "Enter the product name";
      product_name.style.borderColor = "red";
      f = 0;
   }
   else {
      document.getElementById("e1").innerHTML = "";
      product_name.style.borderColor = "green";

   }
   if (product_file.value === "") {
      document.getElementById("e2").innerHTML = "Enter the product Image";
      product_file.style.borderColor = "red";
      f = 0;
   }
   else {
      document.getElementById("e2").innerHTML = "";
      product_file.style.borderColor = "green";

   }
   if (product_quantity.value === "") {
      document.getElementById("e3").innerHTML = "Enter the product Quantity";
      product_quantity.style.borderColor = "red";
      f = 0;
   }
   else {

      product_quantity.style.borderColor = "green";
      if (product_quantity_type.value === "") {
         document.getElementById("e3").innerHTML = "Enter the product Quantity type";
         product_quantity_type.style.borderColor = "red";
         f = 0;
      }
      else {
         document.getElementById("e3").innerHTML = "";
         product_quantity_type.style.borderColor = "green";

      }
   }

   if (product_price.value === "") {
      document.getElementById("e4").innerHTML = "Enter the product Price";
      product_price.style.borderColor = "red";
      f = 0;
   }
   else {
      document.getElementById("e4").innerHTML = "";
      product_price.style.borderColor = "green";

   }
   if (product_Expdate.value === "") {
      document.getElementById("e5").innerHTML = "Enter the product Expire-Date";
      product_Expdate.style.borderColor = "red";
      f = 0;
   }
   else {
      document.getElementById("e5").innerHTML = "";
      product_Expdate.style.borderColor = "green";

   }
   if (product_desc.value === "") {
      document.getElementById("e6").innerHTML = "Enter the product Description";
      product_desc.style.borderColor = "red";
      f = 0;
   }
   else {
      document.getElementById("e6").innerHTML = "";
      product_desc.style.borderColor = "green";

   }
   if (f === 1) {
      return true;
   }
   else {
      return false;
   }
}