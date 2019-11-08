//Express setup

const express = require('express')

const app = express()

const bodyParser = require('body-parser')

app.use(bodyParser.urlencoded({ extended: true }))

app.get('/', (reg, res) => res.sendFile('index.html', {
    root : _dirname
}))

const port = process.env.PORT || 5078

app.listen(port , () => console.log('App listening on port ' + port))