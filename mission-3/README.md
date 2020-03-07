# Mission 3 Relational Database with JDBCTemplate

## GET Method

1. GET Method

    - GET all cars
    ![/api/cars/getAllCars](./img/GET-allcars-method.png)

    - GET by id
    Note that this is return in List, it can be returned in Object, but keeping this returning List for the consistency as other methods are returning List.
    ![/api/cars/getCars/id/1](./img/GET-byid-method.png)

    - GET by brand
    Note that this is return in List, as queryForObject would return error like this [expect: 1, actual: 2].
    ![/api/cars/getCars/brand/Tesla](./img/GET-bybrand-method.png)

2. POST Method

    ![/api/cars/insertCars](./img/POST-method.png)

    Verify by calling getAllCars.
    ![/api/cars/getAllCars](./img/verify-POST-method.png)

    Verify from local mySql instance.
    ![Verification of POST from mySql](./img/verify-POST-method-mySql.png)

3. PUT Method
    ![/api/cars/updateCars/12](./img/PUT-method.png)

    Verify by calling getAllCars.
    ![/api/cars/getAllCars](./img/verify-PUT-method.png)

    Verify from local mySql instance.
    ![Verification of PUT from mySql](./img/verify-PUT-method-mySql.png)

4. DELETE Method
    ![/api/cars/deleteCars/12](./img/DELETE-method.png)

    Verify by calling getAllCars.
    ![/api/cars/getAllCars](./img/verify-DELETE-method.png)

    Verify from local mySql instance.
    ![Verification of DELETE from mySql](./img/verify-DELETE-method-mySql.png)
