const express = require("express");
const app = express();
const path = require('path');
const bodyParser = require(`body-parser`);

app.set('view engine', 'ejs');
app.use(express.static(path.join(__dirname, './public')));
app.use(bodyParser.urlencoded({extended: true}));

app.get("/", (req, res) => {
  res.render(`index`);
});

app.get("/contact", (req, res) => {
  res.render('contact');
})

app.post("/contact", (req, res)=>{
  console.log(req.body);
  let userData = req.body;
  res.render('contact', { sentBack : userData });
})

app.listen(3000, () => {
  console.log("Server is listening on port 3000.");
});