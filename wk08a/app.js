const express = require('express');
const path = require('path');
let app = express();

app.set('view engine', 'ejs');
app.use(express.static(path.join(__dirname, '/public')));

const rows = [
        {   "id":"2",
            "first_name":"Aylmar",
            "last_name":"Mews",
            "email":"amews1@ovh.net",
            "gender":"Male",
            "city":"Ebak",
            "profile":"http:\/\/dummyimage.com\/150x150.png\/5fa2dd\/ffffff",
            "job_details":"General Manager"},
        {"id":"3",
        "first_name":"Reine",
        "last_name":"Truckett",
        "email":"rtruckett2@wsj.com",
        "gender":"Female",
        "city":"London",
        "profile":"http:\/\/dummyimage.com\/150x150.png\/ff4444\/ffffff",
        "job_details":"Analyst Programmer"},
        {   "id":"4",
            "first_name":"Andreana",
            "last_name":"Carnow",
            "email":"acarnow3@prlog.org",
            "gender":"Female",
            "city":"Lipnica",
            "profile":"http:\/\/dummyimage.com\/150x150.png\/dddddd\/000000",
            "job_details":"Web Developer IV"},
        {"id":"5",
        "first_name":"Nikos",
        "last_name":"Grinter",
        "email":"ngrinter4@weebly.com",
        "gender":"Male",
        "city":"London","profile":"http:\/\/dummyimage.com\/150x150.png\/5fa2dd\/ffffff",
        "job_details":"Intern"},
        {"id":"6",
            "first_name":"Cletis",
            "last_name":"Noads",
            "email":"cnoads5@godaddy.com",
            "gender":"Non-binary",
            "city":"Belfast",
            "profile":"http:\/\/dummyimage.com\/150x150.png\/dddddd\/000000",
            "job_details":"Web Designer IV"}
];

app.get('/', function (req, res) {
    let title = "Week 08 Company";
    res.render('landing', { tdata: title });
});

app.get('/about', function (req, res) {
    let title = "About EJS";
    res.render('landing', { tdata: title });
});

app.get('/staff', function (req, res) {
    let title = "EJS Staff";
    res.render('people', { tdata: title, rows, page: 2 });
});

app.get('/member', (req, res) => {
    let title = "EJS Member";
    let rowID= req.query.id;

    let result = rows.find(row => row.id === rowID);
    console.log(result); 
    res.render('member', { tdata: title, result});
});

app.listen(process.env.PORT || 3000);
console.log('Server is listening on  localhost:3000/');