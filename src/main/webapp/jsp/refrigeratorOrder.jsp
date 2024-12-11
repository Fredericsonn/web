<!DOCTYPE html>
<html>
<head>
    <title>Create Refrigerator Order</title>
</head>
<body>
    <h1>Create Refrigerator Order</h1>
    <form action="/app/createOrder" method="post">
        <label for="itemName">Item Name:</label>
        <input type="text" id="itemName" name="itemName" required><br><br>
        
        <label for="quantity">Quantity:</label>
        <input type="number" id="quantity" name="quantity" required><br><br>
        
        <button type="submit">Submit Order</button>
    </form>
</body>
</html>
