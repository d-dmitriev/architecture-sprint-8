const express = require('express')
var cors = require('cors')
const app = express()
const Keycloak = require('keycloak-connect')

const keycloak = new Keycloak({})
keycloak.accessDenied = (_, response) => {
    response.status(401)
    response.end()
}

app.use(cors())
app.use(keycloak.middleware())

app.get('/reports', keycloak.protect("realm:prothetic_user"), async (_, res) => {
    res.json([1, 2, 3, 4, 5, 6, 7, 8, 9, 10])
})

app.listen(8000, () => {
    console.log('Web application is listening on port 8000')
})