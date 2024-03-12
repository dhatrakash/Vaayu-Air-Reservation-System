import axios from 'axios';
import { BASE_API } from '../constants/ApiConstant';

const CITIES_API_BASE_URL = 'http://localhost:8080';

class ApiService {
    
    fetchCities() {
        const tocken=sessionStorage.getItem("jwt")
        const config ={
            headers:{
                'Authorization':`Bearer ${tocken}`
            }
        };
    
        return axios.get(BASE_API+'/cities',config);
    }

}

export default new ApiService();