application {
    title = 'BookGorm'
    startupGroups = ['bookGorm']

    // Should Griffon exit when no Griffon created frames are showing?
    autoShutdown = true

    // If you want some non-standard application class, apply it here
    //frameClass = 'javax.swing.JFrame'
}
mvcGroups {
    // MVC Group for "bookGorm"
    'bookGorm' {
        model      = 'bookgorm.BookGormModel'
        view       = 'bookgorm.BookGormView'
        controller = 'bookgorm.BookGormController'
    }

}
