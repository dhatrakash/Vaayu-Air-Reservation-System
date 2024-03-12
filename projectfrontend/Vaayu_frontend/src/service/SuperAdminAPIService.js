// import axios from 'axios';
// import qs from 'qs';
// import { BASE_API } from '../constants/ApiConstant';
// const SUPERADMIN_API_BASE_URL = 'http://localhost:8080';

// class ApiService{
//     fetchFeedbackByFlightId(airId) {
//         return axios.get(BASE_API+'/superadmin/feedback', { params: { airId : airId } } );
//     }
//     getRevenueReport(airline,period) {
//         return axios.get(BASE_API+'/superadmin/revenue_report'  ,{ params: { airlineName : airline, interval :period }, paramsSerializer: (params) => {
//             return qs.stringify(params, { arrayFormat: 'repeat' })
//           }, } );
//     }
//     getTotalBookings(){
//         return axios.get(BASE_API+'/superadmin/get_total_bookings');
//     }
//     getCancelledBookings(){
//         return axios.get(BASE_API+'/superadmin/get_cancelled_bookings'); 
//     }
//     getAirlineRevenue(){
//         return axios.get(BASE_API+'/superadmin/get_airline_revenue');
//     }
// }

// export default new ApiService();

import axios from 'axios';
import qs from 'qs';
import { BASE_API } from '../constants/ApiConstant';

const SUPERADMIN_API_BASE_URL = 'http://localhost:8080';

class ApiService {
  fetchFeedbackByFlightId(airId) {
    const token = sessionStorage.getItem('jwt');
    const config = {
      headers: {
        'Authorization': `Bearer ${token}`
      }
    };
    return axios.get(BASE_API + '/superadmin/feedback', {
      params: {
        airId: airId
      },
      ...config
    });
  }
  getRevenueReport(airline, period) {
    const token = sessionStorage.getItem('jwt');
    const config = {
      headers: {
        'Authorization': `Bearer ${token}`
      },
      params: {
        airlineName: airline,
        interval: period
      },
      paramsSerializer: (params) => {
        return qs.stringify(params, { arrayFormat: 'repeat' })
      }
    };
    return axios.get(BASE_API + '/superadmin/revenue_report', config);
  }
  getTotalBookings() {
    const token = sessionStorage.getItem('jwt');
    const config = {
      headers: {
        'Authorization': `Bearer ${token}`
      }
    };
    return axios.get(BASE_API + '/superadmin/get_total_bookings', config);
  }
  getCancelledBookings() {
    const tocken = sessionStorage.getItem('jwt');
    const config = {
      headers: {
        'Authorization': `Bearer ${tocken}`
      }
    };
    return axios.get(BASE_API + '/superadmin/get_cancelled_bookings', config);
  }
  getAirlineRevenue() {
    const tocken = sessionStorage.getItem('jwt');
    const config = {
      headers: {
        'Authorization': `Bearer ${tocken}`
      }
    };
    return axios.get(BASE_API + '/superadmin/get_airline_revenue', config);
  }
}

export default new ApiService();
