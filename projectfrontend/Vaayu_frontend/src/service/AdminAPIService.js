import axios from 'axios';
import { BASE_API } from '../constants/ApiConstant';
const ADMIN_API_BASE_URL = 'http://localhost:8080';

class ApiService{
    fetchPassengersByFlightId(airId) {
        const tocken=sessionStorage.getItem("jwt")
        const config ={
            headers:{
                'Authorization':`Bearer ${tocken}`
            }
        };
        return axios.get(BASE_API+'/admin/passenger_list/' + airId ,config);
    }
}

export default new ApiService();

