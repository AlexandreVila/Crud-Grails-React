package crud.grails.react

import demo.Admin
import demo.Role
import demo.UserRole

class BootStrap {

    def init = { servletContext ->

        def admin = new Admin(name: "Admin", username: "Admin", password: "Admin").save()

        Role role = new Role(authority: "ROLE_ADMIN").save()

        UserRole.create(admin, role, true)

    }
    def destroy = {
    }
}
