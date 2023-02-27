const express = require("express");
const app = express();
const path = require('path');

app.set('view engine', 'ejs');

app.use(express.static(path.join(__dirname, './public')));

app.get("/", (req, res) => {
  res.send("Hello World!");
});


app.listen(3000, () => {
  console.log("Server is listening on port 3000.");
});