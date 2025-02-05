import axios from 'axios';

export default axios.create({
    baseURL: ' https://684a-105-157-51-238.ngrok-free.app/',
    // baseURL: ' https://localhost:8080/',
    headers: {"ngrok-skip-browser-warning": "true"
    }   
})