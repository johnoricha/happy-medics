# happy-medics-Rest API
This is a simple Rest API for a medical hostical called HappyMedics. 
This API provides endpoints for:
1. Creating a new user (doctor or patient)
2. Deleting a user (doctor or patient)
3. Making an appointment
4. Deleting an appointment

# endpoints
Request
## add-new-user
curl --location --request POST 'http://glacial-everglades-85578.herokuapp.com/happymedics/api/add-new-user' \
--header 'Content-Type: application/json' \
--data-raw '{
    "name": "cynthia",
    "email": "cynthia.gmail",
    "accountType": "doctor",
    "dob": "1995-02-23"
}'\

OR\

curl --location --request POST 'https://glacial-everglades-85578.herokuapp.com/happymedics/api/add-new-user' \
--header 'Content-Type: application/json' \
--data-raw '{
    "name": "david",
    "email": "david.gmail",
    "accountType": "patient",
    "dob": "1992-02-23"
}'

## delete-user
curl --location --request DELETE 'https://glacial-everglades-85578.herokuapp.com/happymedics/api/delete-user/{userId}' \
--header 'Content-Type: application/json' \

## make-appointment 
curl --location --request POST 'http://glacial-everglades-85578.herokuapp.com/happymedics/api/make-appointment' \
--header 'Content-Type: application/json' \
--data-raw '{
    "title": "Appointment with Dr Vivian",
    "doctor": "vivian",
    "patient": "gladys",
    "scheduledTime": "2021-02-23"
}'

## delete-appointment 
curl --location --request DELETE 'http://glacial-everglades-85578.herokuapp.com/api/delete-appointment/{appointmentId}' \
--header 'Content-Type: application/json'

#Libraries And Frameworks
1. Spring Boot
2. MySql
3. Java

