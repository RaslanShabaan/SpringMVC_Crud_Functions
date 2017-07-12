<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Spring Mvc Crud </title>
</head>
<body>
<h2> Insert User :</h2>
<form action="Insert" method="post" style="border: 1px solid #000;width: 500px">
<br>

    <label>Enter Your Id</label>
    <input name="Id" type="text"/>

    <br>

    <label>Enter Your Name</label>
    <input name="Name" type="text"/>

    <br>

    <label>Enter Your PassWord</label>
    <input name="Pass" type="password"/>

    <br>
<button> Insert </button>
<br>
</form>



<h2> Delete User :</h2>
<form action="Delete" method="post" style="border: 1px solid #000;width: 500px">
    <br>

    <label>Enter Your Id</label>
    <input name="Id" type="text"/>

    <br>

    <br>
    <button> Delete </button>
    <br>
</form>



<h2> Select User :</h2>
<form action="Select" method="post" style="border: 1px solid #000;width: 500px">
    <br>

    <label>Enter Your Id</label>
    <input name="Id" type="text"/>

    <br>

    <br>
    <button> Select </button>
    <br>
</form>


<h2> Updat User :</h2>
<form action="Update" method="post" style="border: 1px solid #000;width: 500px">
    <br>

    <label>Enter Your Id</label>
    <input name="Id" type="text"/>

    <br>

    <label>Enter Your Name</label>
    <input name="Name" type="text"/>

    <br>

    <label>Enter Your PassWord</label>
    <input name="Pass" type="password"/>

    <br>
    <button> Update</button>
    <br>
</form>


<h2> Select All User :</h2>
<form action="SelectAll" method="post" style="border: 1px solid #000;width: 500px">
    <br>

    <button> Select All </button>
    <br>
</form>

</body>
</html>
