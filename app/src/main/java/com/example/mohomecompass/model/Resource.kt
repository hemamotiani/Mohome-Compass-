package com.example.mohomecompass.model

data class Resource(
    val name: String,
    val location: String,
    val description: String,
    val hours: String,
    val services: List<String>,
    val contactInfo: String,
    val websiteUrl: String? = null
)

// Predefined resources data
object ResourcesData {
    val resources = mapOf(
        "Dining Hall" to Resource(
            name = "Dining Hall",
            location = "Central Campus",
            description = "Mount Holyoke's main dining facility offering diverse meal options",
            hours = "Monday-Friday: 7:00 AM - 8:00 PM\nWeekends: 8:00 AM - 7:00 PM",
            services = listOf("Breakfast", "Lunch", "Dinner", "Special Dietary Options", "Grab & Go"),
            contactInfo = "dining@mtholyoke.edu\n(413) 538-2000"
        ),
        "Williston Library" to Resource(
            name = "Williston Library",
            location = "Library Complex",
            description = "The main academic library serving the Mount Holyoke community",
            hours = "Monday-Thursday: 8:00 AM - 12:00 AM\nFriday: 8:00 AM - 10:00 PM\nWeekends: 10:00 AM - 10:00 PM",
            services = listOf("Study Spaces", "Research Help", "Book Borrowing", "Computer Labs", "Printing Services"),
            contactInfo = "library@mtholyoke.edu\n(413) 538-2225"
        ),
        "Gym" to Resource(
            name = "Kendall Sports & Dance Complex",
            location = "Athletic Complex",
            description = "State-of-the-art athletic facility for students and faculty",
            hours = "Monday-Friday: 6:00 AM - 9:00 PM\nWeekends: 8:00 AM - 8:00 PM",
            services = listOf("Fitness Center", "Swimming Pool", "Dance Studios", "Indoor Track", "Sports Courts"),
            contactInfo = "athletics@mtholyoke.edu\n(413) 538-2310"
        ),
        "Counseling Service" to Resource(
            name = "Counseling Service",
            location = "Health Center Building",
            description = "Confidential mental health and counseling services for students",
            hours = "Monday-Friday: 9:00 AM - 5:00 PM",
            services = listOf("Individual Counseling", "Group Therapy", "Crisis Support", "Wellness Workshops", "Consultation"),
            contactInfo = "counseling@mtholyoke.edu\n(413) 538-2037"
        ),
        "Health Services Office" to Resource(
            name = "Health Services Office",
            location = "Health Center Building",
            description = "Comprehensive health care services for students",
            hours = "Monday-Friday: 8:30 AM - 5:00 PM",
            services = listOf("Medical Care", "Lab Services", "Immunizations", "Health Education", "Prescription Services"),
            contactInfo = "health@mtholyoke.edu\n(413) 538-2242"
        ),
        "Financial Services Office" to Resource(
            name = "Student Financial Services",
            location = "Mary Lyon Hall",
            description = "Financial aid and student account services",
            hours = "Monday-Friday: 8:30 AM - 4:30 PM",
            services = listOf("Financial Aid", "Student Accounts", "Payment Plans", "Billing Support", "Scholarship Information"),
            contactInfo = "sfs@mtholyoke.edu\n(413) 538-2291"
        ),
        "Registrar's Office" to Resource(
            name = "Registrar's Office",
            location = "Mary Lyon Hall",
            description = "Academic records and registration services",
            hours = "Monday-Friday: 8:30 AM - 4:30 PM",
            services = listOf("Course Registration", "Transcripts", "Degree Audit", "Academic Records", "Enrollment Verification"),
            contactInfo = "registrar@mtholyoke.edu\n(413) 538-2025"
        ),
        "Career Development Center" to Resource(
            name = "Career Development Center",
            location = "Blanchard Hall",
            description = "Career planning and professional development services",
            hours = "Monday-Friday: 9:00 AM - 5:00 PM",
            services = listOf("Career Counseling", "Resume Reviews", "Interview Prep", "Job Search Help", "Networking Events"),
            contactInfo = "cdc@mtholyoke.edu\n(413) 538-2080"
        ),
        "Pratt Music Library" to Resource(
            name = "Pratt Music Library",
            location = "Pratt Hall",
            description = "Specialized music collection and resources",
            hours = "Monday-Friday: 9:00 AM - 9:00 PM\nWeekends: 12:00 PM - 6:00 PM",
            services = listOf("Sheet Music", "Audio Collection", "Practice Rooms", "Music Technology", "Research Support"),
            contactInfo = "musiclib@mtholyoke.edu\n(413) 538-2456"
        )
    )
} 