// import axios from 'axios';
// import { BASE_API } from '../constants/ApiConstant';

// const USER_API_BASE_URL = 'http://localhost:8080';

// class ApiService {

//     fetchUserById(userid) {
//         return axios.get(BASE_API+'/user/get_user/'+userid );
//     }

//     editUser(user, uid) {
//         return axios.put(BASE_API+'/user/edit_profile', user, { params: { uid : uid } })
//     }
//     getbookingsByUserId(uid)
//     {
//         return axios.get(BASE_API+'/customer/get_userbookings/'+uid)
//     }
//     postFeedback(feedback, bid)
//     {
//         return axios.put(BASE_API+'/customer/post_feedback', feedback, { params: { bid : bid } } )
//     }

//     bookTicket(book){
//         return axios.post(BASE_API+'/customer/book-ticket', book)
//     }
// }

// export default new ApiService();

import axios from "axios";
import { BASE_API } from "../constants/ApiConstant";

const USER_API_BASE_URL = "http://localhost:8080";

class ApiService {
  fetchUserById(userid) {
    const tocken = sessionStorage.getItem("jwt");
    const config = {
      headers: {
        Authorization: `Bearer ${tocken}`,
      },
    };
    return axios.get(BASE_API + "/user/get_user/" + userid, config);
  }

  // editUser(user, uid) {
  //     const tocken = sessionStorage.getItem('jwt');
  //     const config = {
  //         headers: {
  //             'Authorization': `Bearer ${tocken}`
  //         }
  //     };
  //     return axios.put(BASE_API+'/user/edit_profile', user, { params: { uid : uid }, config });
  // }
  editUser(user, uid) {
    const tocken = sessionStorage.getItem("jwt");
    const config = {
      headers: {
        Authorization: `Bearer ${tocken}`,
      },
    };

    return axios.put(BASE_API + "/user/edit_profile", user, {
      params: { uid: uid },
      ...config, // merge the config object into the request options
    });
  }

  getbookingsByUserId(uid) {
    const tocken = sessionStorage.getItem("jwt");
    const config = {
      headers: {
        Authorization: `Bearer ${tocken}`,
      },
    };
    return axios.get(BASE_API + "/customer/get_userbookings/" + uid, config);
  }

  //   postFeedback(feedback, bid) {
  //     const tocken = sessionStorage.getItem("jwt");
  //     const config = {
  //       headers: {
  //         Authorization: `Bearer ${tocken}`,
  //       },
  //     };
  //     return axios.put(BASE_API + "/customer/post_feedback", feedback, {
  //       params: { bid: bid },
  //       config,
  //     });
  //   }
  postFeedback(feedback, bid) {
    const tocken = sessionStorage.getItem("jwt");
    const config = {
      headers: {
        Authorization: `Bearer ${tocken}`,
      },
    };
    return axios.put(BASE_API + "/customer/post_feedback", feedback, {
      params: { bid: bid },
      ...config, // merge the config object into the request options
    });
  }

  bookTicket(book) {
    const tocken = sessionStorage.getItem("jwt");
    const config = {
      headers: {
        Authorization: `Bearer ${tocken}`,
      },
    };
    return axios.post(BASE_API + "/customer/book-ticket", book, config);
  }
}

export default new ApiService();
