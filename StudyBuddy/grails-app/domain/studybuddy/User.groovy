package studybuddy

class User {
    String username
    String email
    String profile_id

    static mapping = {
        id column: 'username', generator: 'assigned', name: 'username'
        version false
    }
    static constraints = {
    }

}
