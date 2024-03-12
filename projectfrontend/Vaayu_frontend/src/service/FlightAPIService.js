// import axios from "axios";
// import { BASE_API } from "../constants/ApiConstant";

// const FLIGHT_API_BASE_URL = "http://localhost:8080";

// class ApiService {

//   // getconfig(){
//   //   const tocken=sessionStorage.getItem("jwt")
//   //       const config ={
//   //           headers:{
//   //               'Authorization':`Bearer ${tocken}`
//   //           }
//   //       };
//   //       return config;
//   // }
  
//   fetchFlightById(aid) {
    
//     return axios.get(BASE_API+"/customer/select_flight", {
//       params: { aid: aid }
//     });
//   }

//   editFlight(flight) {
//     const tocken=sessionStorage.getItem("jwt")
//         const config ={
//             headers:{
//                 'Authorization':`Bearer ${tocken}`
//             }
//         };
//     return axios.put(BASE_API+"/admin/update_airline", flight,config);
//   }

//   getBookingsByFlightId(aid) {
//     return axios.get(BASE_API+"/admin/get_bookings/" + aid);
//   }

//   getBookingsByUserId(uid){
//     return axios.get(BASE_API+'/customer/get_userbookings/' + uid)
// }

//   cancelBookingByBookId(bid) {
//     return axios.delete(BASE_API+"/admin/delete_booking", {
//       params: { bid: bid },
//     });
//   }

//   addAirline(flight) {
//     const tocken=sessionStorage.getItem("jwt")
//         const config ={
//             headers:{
//                 'Authorization':`Bearer ${tocken}`
//             }
//         };
//     return axios.post(BASE_API+"/superadmin/add_airline", flight,config);
//   }
//   updateBooking(airlineId) {
//     console.log(airlineId);
//     return axios.put(
//       BASE_API+"/admin/update_booking/" + airlineId
//     );
//   }

//   cancelBookingByUserId(bId){
//     return axios.delete(BASE_API+'/customer/cancel_ticket' ,{ params: { bId : bId } })
// }

//   getFlight(from, to, departure) {
//     const tocken=sessionStorage.getItem("jwt")
//         const config ={
//             headers:{
//                 'Authorization':`Bearer ${tocken}`
//             }
//         };
//     //console.log("in get flight"+fromCity + "  " + toCity + "  " + departureDate);
//     return axios.get(
//       BASE_API+"/customer/search_flight/" + departure,config,
//       {
//         params: {
//           fromCity: from,
//           toCity: to,
//         }
//       }
//     );
//   }
//   getAirlineNames(){
//     const tocken=sessionStorage.getItem("jwt")
//         const config ={
//             headers:{
//                 'Authorization':`Bearer ${tocken}`
//             }
//         };
//     return axios.get(BASE_API+'/superadmin/airline_names',config)
//   }
//   addCities(cities){
//     console.log("add cities axios");
//     return axios.put(BASE_API+'/superadmin/add_city', cities)
//   }
// }

// export default new ApiService();


import axios from "axios";
import { BASE_API } from "../constants/ApiConstant";

const FLIGHT_API_BASE_URL = "http://localhost:8080";

class ApiService {

  fetchFlightById(aid) {
    const tocken=sessionStorage.getItem("jwt")
    const config ={
        headers:{
            'Authorization':`Bearer ${tocken}`
        }
    };
    return axios.get(BASE_API+"/customer/select_flight", {
      params: { aid: aid },
      headers: {
        'Authorization': `Bearer ${sessionStorage.getItem("jwt")}`
      }
    },config);
  }

  editFlight(flight) {
    const tocken=sessionStorage.getItem("jwt")
    const config ={
        headers:{
            'Authorization':`Bearer ${tocken}`
        }
    };
    return axios.put(BASE_API+"/admin/update_airline", flight, {
      headers: {
        'Authorization': `Bearer ${sessionStorage.getItem("jwt")}`
      }
    },config);
  }

  getBookingsByFlightId(aid) {
    const tocken=sessionStorage.getItem("jwt")
    const config ={
        headers:{
            'Authorization':`Bearer ${tocken}`
        }
    };
    return axios.get(BASE_API+"/admin/get_bookings/" + aid, {
      headers: {
        'Authorization': `Bearer ${sessionStorage.getItem("jwt")}`
      }
    },config);
  }

  getBookingsByUserId(uid){
    const tocken=sessionStorage.getItem("jwt")
    const config ={
        headers:{
            'Authorization':`Bearer ${tocken}`
        }
    };
    return axios.get(BASE_API+'/customer/get_userbookings/' + uid, {
      headers: {
        'Authorization': `Bearer ${sessionStorage.getItem("jwt")}`
      }
    },config);
  }

  cancelBookingByBookId(bid) {
    const tocken=sessionStorage.getItem("jwt")
    const config ={
        headers:{
            'Authorization':`Bearer ${tocken}`
        }
    };
    return axios.delete(BASE_API+"/admin/delete_booking", {
      params: { bid: bid },
      headers: {
        'Authorization': `Bearer ${sessionStorage.getItem("jwt")}`
      }
    },config);
  }

  addAirline(flight) {
    const tocken=sessionStorage.getItem("jwt")
    const config ={
        headers:{
            'Authorization':`Bearer ${tocken}`
        }
    };
    return axios.post(BASE_API+"/superadmin/add_airline", flight, {
      headers: {
        'Authorization': `Bearer ${sessionStorage.getItem("jwt")}`
      }
    },config);
  }

  updateBooking(airlineId) {
    console.log(airlineId);
    const tocken=sessionStorage.getItem("jwt")
    const config ={
        headers:{
            'Authorization':`Bearer ${tocken}`
        }
    };
    return axios.put(
      BASE_API+"/admin/update_booking/" + airlineId,
      null,
      {
        headers: {
          'Authorization': `Bearer ${sessionStorage.getItem("jwt")}`
        }
      },config
    );
  }

  cancelBookingByUserId(bId){
    const tocken=sessionStorage.getItem("jwt")
    const config ={
        headers:{
            'Authorization':`Bearer ${tocken}`
        }
    };
    return axios.delete(BASE_API+'/customer/cancel_ticket' ,{
      params: { bId : bId },
      headers: {
        'Authorization': `Bearer ${sessionStorage.getItem("jwt")}`
      }
    },config);
  }

  getFlight(from, to, departure) {
    const tocken=sessionStorage.getItem("jwt")
    const config ={
        headers:{
            'Authorization':`Bearer ${tocken}`
        }
    };
    return axios.get(
      BASE_API+"/customer/search_flight/" + departure,
      {
        params: {
          fromCity: from,
          toCity: to,
        },
        headers: {
          'Authorization': `Bearer ${sessionStorage.getItem("jwt")}`
        }
      },config
    );
  }

  getAirlineNames(){
    const tocken=sessionStorage.getItem("jwt")
    const config ={
        headers:{
            'Authorization':`Bearer ${tocken}`
        }
    };
    return axios.get(BASE_API+'/superadmin/airline_names', {
      headers: {
        'Authorization': `Bearer ${sessionStorage.getItem("jwt")}`
      }
    },config);
  }

  addCities(cities){
    const tocken=sessionStorage.getItem("jwt")
    const config ={
        headers:{
            'Authorization':`Bearer ${tocken}`
        }
    };
    console.log("add cities axios");
    return axios.put(BASE_API+'/superadmin/add_city', cities, {
      headers: {
        'Authorization': `Bearer ${sessionStorage.getItem("jwt")}`
      }
    },config);
  }
}

export default new ApiService();
