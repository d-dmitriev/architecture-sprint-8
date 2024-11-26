const express = require('express')
const app = express()
const port = 3000

app.get('/hello/:user', (req, res) => {
    const user = req.params.user || "unknown"
    res.send(`Hello, ${user.charAt(0).toUpperCase()}${user.slice(1)}`)
})

const server = app.listen(port, () => {
    console.log(`Web application is listening on port ${port}`)
})

process.on('SIGINT', end)
process.on('SIGTERM', end)

function end(signal) {
    console.log(`${signal} signal received: closing HTTP server`)
    server.close(() => {
        console.log('HTTP server closed')
    })
    server.closeAllConnections()
}