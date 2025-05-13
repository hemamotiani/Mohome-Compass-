package com.example.mohomecompass.model

data class Resource(
    val name: String,
    val location: String,
    val description: String,
    val hours: String,
    val services: List<ServiceItem>,
    val contactInfo: ContactInfo,
    val websiteUrl: String? = null,
    val hoursUrl: String? = null,
    val menuUrl: String? = null,
    val dietaryInfoUrl: String? = null
)

data class ServiceItem(
    val name: String,
    val url: String? = null
)

data class ContactInfo(
    val email: String,
    val phone: String
)

// Predefined resources data
object ResourcesData {
    val resources = mapOf(
        "Dining Commons" to Resource(
            name = "Dining Commons",
            location = "Blanchard Hall",
            description = "Mount Holyoke's main dining facility offering diverse meal options",
            hours = "Sunday-Thursday: 7:15 AM - 10:00 PM\nFriday-Saturday: 7:15 AM - 12:00 AM",
            hoursUrl = "https://www.mtholyoke.edu/student-experience/living-campus/dining/dining-center-hours-and-openingclosing-schedule",
            menuUrl = "https://menu.mtholyoke.edu/location.aspx?_ga=2.100136990.1238839547.1747055284-482502109.1731079610",
            dietaryInfoUrl = "https://www.mtholyoke.edu/student-experience/living-campus/dining/accommodations-food-allergies-or-medically-restricted-diets",
            services = listOf(
                ServiceItem("View Today's Menu", "https://menu.mtholyoke.edu/location.aspx?_ga=2.100136990.1238839547.1747055284-482502109.1731079610"),
                ServiceItem("Special Dietary Options", "https://www.mtholyoke.edu/student-experience/living-campus/dining/accommodations-food-allergies-or-medically-restricted-diets"),
            ),
            contactInfo = ContactInfo(
                email = "dining@mtholyoke.edu",
                phone = "413-538-2100"
            )
        ),
        "Library" to Resource(
            name = "Library",
            location = "Williston Library",
            description = "The main academic library serving the Mount Holyoke community",
            hours = "Monday-Thursday: 8:00 AM - 2:00 AM\nFriday-Sunday: 9:00 AM - 10:00 PM",
            hoursUrl = "https://lits.mtholyoke.edu/about-lits/service-desks/circulation-services/hours",
            services = listOf(
                ServiceItem("Reserve Study Spaces", "https://mtholyoke.libcal.com/reserve/groupstudyrooms"),
                ServiceItem("Research Help Appointment", "https://mtholyoke.libcal.com/appointments/researchservices"),
                ServiceItem("Media Services", "https://lits.mtholyoke.edu/about-lits/service-desks/media-services"),
                ServiceItem("Checkout Tech & Books", "https://lits.mtholyoke.edu/about-lits/service-desks/circulation-services"),
                ServiceItem("OneCard Replacement", "https://lits.mtholyoke.edu/about-lits/service-desks/technology-help-desk")
            ),
            contactInfo = ContactInfo(
                email = "ask-lits@mtholyoke.edu",
                phone = "413-538-2622"
            )
        ),
        "Fitness Center" to Resource(
            name = "Fitness Center",
            location = "Kendall Sports & Dance Complex",
            description = "State-of-the-art athletic facility for students and faculty",
            hours = "Monday-Friday: 6:30 AM - 10:00 PM\nSaturday: 8:00 AM - 6:00 PM\nSunday: 12:00 PM - 8:00 PM",
            services = listOf(
                ServiceItem("Gymnasium/Gym"),
                ServiceItem("Swimming Pool"),
                ServiceItem("Dance Studios"),
                ServiceItem("Track field"),
                ServiceItem("Squash Courts"),
                ServiceItem("Sports Equipment Rental"),
                ServiceItem("P.E Classes")
            ),
            contactInfo = ContactInfo(
                email = "athletics@mtholyoke.edu",
                phone = "413-538-2310"
            )
        ),
        "Counseling Service" to Resource(
            name = "Counseling Service",
            location = "Health Center Building",
            description = "Confidential mental health and counseling services for students",
            hours = "Monday-Friday: 9:00 AM - 5:00 PM",
            services = listOf(
                ServiceItem("Schedule an appointment", url = "https://www.mtholyoke.edu/directory/departments-offices-centers/counseling-service/services-and-scheduling"),
                ServiceItem("Urgent Care"),
                ServiceItem("Medication Consulation/Management"),
                ServiceItem("Group Support & Workshops"),
                ServiceItem("Drop-in Hours")
            ),
            contactInfo = ContactInfo(
                email = "eweather@mtholyoke.edu",
                phone = "413-538-2037"
            )
        ),
        "Health Services Office" to Resource(
            name = "Health Services Office",
            location = "Health Center Building",
            description = "Comprehensive health care services for students",
            hours = "Monday-Friday: 9:00 AM - 5:00 PM",
            services = listOf(
                ServiceItem("Student Portal/Scheduling", url = "https://login.mtholyoke.edu/idp/profile/SAML2/Redirect/SSO?execution=e2s1"),
                ServiceItem("Illness and Injury"),
                ServiceItem("Immunizations"),
                ServiceItem("Gender-affirming Care"),
                ServiceItem("Prescription Services"),
                ServiceItem("Emergency Department")
            ),
            contactInfo = ContactInfo(
                email = "health-admin@mtholyoke.edu",
                phone = "413-538-2121"
            )
        ),
        "Financial Services Office" to Resource(
            name = "Student Financial Services",
            location = "16 Skinner Hall",
            description = "Financial aid and student account services",
            hours = "Monday-Friday: 8:30 AM - 5:00 PM",
            services = listOf(
                ServiceItem("Book an appointment", url = "https://mtholyokesfs.youcanbook.me/"),
                ServiceItem("Financial Aid Forms", url = "https://www.mtholyoke.edu/directory/departments-offices-centers/student-financial-services/financial-aid-forms"),
                ServiceItem("Payment Portal", url = "https://login.mtholyoke.edu/idp/profile/SAML2/Redirect/SSO?execution=e5s1"),
                ServiceItem("Graduate School fee", url = "https://www.mtholyoke.edu/admission/graduate/tuition-fees-aid")

            ),
            contactInfo = ContactInfo(
                email = "sfs@mtholyoke.edu",
                phone = "413-538-2291"
            )
        ),
        "Registrar's Office" to Resource(
            name = "Registrar's Office",
            location = "Mary Lyon Hall",
            description = "Academic records and registration services",
            hours = "Monday-Friday: 8:30 AM - 5:00 PM",
            services = listOf(
                ServiceItem("Request Transcript", url = "https://www.mtholyoke.edu/directory/departments-offices-centers/registrar/transcript-requests"),
                ServiceItem("Graduation Requirements", url = "https://www.mtholyoke.edu/academics/degrees-and-graduation-requirements"),
                ServiceItem("Policies & Procedures", url = "https://www.mtholyoke.edu/policies?policy=318"),
                ServiceItem("Academic Forms", url = "https://offices.mtholyoke.edu/registrar/forms?_ga=2.35631393.1238839547.1747055284-482502109.1731079610")
            ),
            contactInfo = ContactInfo(
                email = "registrar@mtholyoke.edu",
                phone = "413-538-2025"
            )
        ),
        "Career Development Center" to Resource(
            name = "Career Development Center",
            location = "Blanchard Hall",
            description = "Career planning and professional development services",
            hours = "Monday-Friday: 9:00 AM - 5:00 PM",
            services = listOf(
                ServiceItem("Book an appointment", url = "https://mtholyoke.joinhandshake.com/appointments"),
                ServiceItem("Career Counseling"),
                ServiceItem("Resume Reviews"),
                ServiceItem("Interview Prep"),
                ServiceItem("Drop-in hours"),
                ServiceItem("Networking Events"),
            ),
            contactInfo = ContactInfo(
                email = "cdc@mtholyoke.edu",
                phone = "413-538-2080"
            )
        ),
        "Pratt Music Library" to Resource(
            name = "Pratt Music Library",
            location = "Pratt Hall",
            description = "Specialized music collection and resources",
            hours = "Sunday-Thursday: 9:00 AM - 11:00 PM\nFriday-Saturday: 9:00 AM - 5:00 PM",
            services = listOf(
                ServiceItem("Music Research", url = "https://guides.mtholyoke.edu/music"),
                ServiceItem("Music Classes"),
                ServiceItem("Practice Rooms"),
                ServiceItem("Borrow Tech Equipment"),
                ServiceItem("Study Rooms")
            ),
            contactInfo = ContactInfo(
                email = "libcirc@mtholyoke.edu",
                phone = "413-538-2622"
            )
        )
    )
} 