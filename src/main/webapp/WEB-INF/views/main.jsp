<!DOCTYPE html>
<html>
<head>
  <meta charset="ISO-8859-1">
  <title>Java Servlet Tutorial</title>
</head>
<body>
        <h1>!!Calculator!!</h1>
        <form action="result">
            <h6>+,-,*,/</h6>
            Number 1...:  <input type="text" name="num1"></input><br>
            Number 2...:  <input type="text" name="num2"></input><br>
            Operation....:<input type="text" name="operation"></input><br><br><br>
            <input type="submit" name="submit"></input><br><br>
        </form>
        
        <form action="TransferDataUsingModel">
            <input type="submit" name="TransferDataUsingModel" value="TransferDataUsingModel"></input><br><br>
        </form>
        
        <form action="TransferListUsingModel">
            <input type="submit" name="TransferListUsingModel" value="TransferListUsingModel"></input><br><br>
        </form>
        
        <form action="TransferListUsingModelAndView">
            <input type="submit" name="TransferListUsingModelAndView" value="MTransferListUsingModelAndView"></input><br><br>
        </form>
        
        <form action="ReadDataUsingEL">
            <input type="submit" name="ReadDataUsingEL" value="ReadDataUsingEL"></input><br><br>
        </form>
        
        <form action="ReadDataUsingJSTL">
            <input type="submit" name="ReadDataUsingJSTL" value="ReadDataUsingJSTL"></input><br><br>
        </form>
</body>
</html>