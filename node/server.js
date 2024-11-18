const { randomUUID } = require('crypto')
const express = require('express')
var cors = require('cors')
const app = express()
const Keycloak = require('keycloak-connect')

const APP_ROLE_REPORTS = process.env.APP_ROLE_REPORTS

const keycloak = new Keycloak({})
keycloak.accessDenied = (_, response) => {
    response.status(401)
    response.end()
}

app.use(cors())
app.use(keycloak.middleware())

app.get('/reports', keycloak.protect(APP_ROLE_REPORTS), async (_, res) => {
    const list = []
    for (var i = 0; i < 10; i++) list.push(randomUUID())
    res.json(list)
})

app.listen(8000, () => {
    console.log('Web application is listening on port 8000')
})