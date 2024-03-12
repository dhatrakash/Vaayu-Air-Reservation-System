import { Component } from "react";
import "./about.css"

export default class AboutScreen extends Component {
  render() {
    return (
      <div className="container-fixed">
        <br></br>
        <br></br>
        <br></br>
        <div class="watercolor-div container">
          <div class="row">
            <div class="col-sm-2"></div>
            <div class="col-sm-7 text-black">
              <h1 >Welcome to Airline Reservation System</h1>
              <p>
              The web based “Airline Reservation System” project is an attempt to stimulate the basic concepts of airline reservation system. The system enables the customer to do the things such as search for airline flights for two travel cities on a specified date, choose a flight based on the details and reservation of flight 
		The system provides you Quick Search facility that provides you details about flights without login . But if user want to book ticket then it must require login into your account.
The system allows the airline passenger to search for flights that are available between the two travel cities, namely the “Departure city” and “Destination city” for a particular departure and arrival dates. The system displays all the flight’s details such as flight no, name, price and time of journey etc.
Here we provided quick search facility which displays list of available flights and allows customer to choose a particular flight. Then the system checks for the availability of seats on the flight. If the seats are available then the system allows the passenger to book a seat. Otherwise it asks the user to choose another flight.
To book a flight the system asks the customer to enter his details such as name, address, city, state, credit card number and contact number. Then it checks the validity of card and book the flight and update the airline database and user database.

              </p>
              <hr></hr>
              <hr></hr>
              <br/>

            </div>
          </div>
        </div>
      </div>
    );
  }
}
