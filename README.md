# INFO5100_Final_Project
# MediLink - Healthcare Ecosystem

**Project Title**: MediLink  
**Group Number**: 21

### **Overview**
MediLink is a role-based healthcare ecosystem designed to streamline operations, improve patient experiences, and foster seamless collaboration among healthcare providers, diagnostics, emergency services, and pharmaceuticals. This platform connects various enterprises and organizations within the healthcare system to ensure real-time communication, efficient resource allocation, and transparency in services.

### **Key Features**
- **Centralized Platform**: Unified interface for all healthcare stakeholders.
- **Role-Specific Dashboards**: Tailored workflows for administrators, technicians, and service providers.
- **Efficient Resource Allocation**: Automates processes for ambulances, diagnostic tests, and pharmacy orders.
- **Transparency and Trust**: Patients have visibility into services, costs, and timelines.
- **Scalable Infrastructure**: Designed to grow with expanding healthcare needs.

### **Problem Statement**
The healthcare ecosystem is fragmented, resulting in inefficiencies, delays, and poor patient care. Key issues include:
- **For Patients**: Difficulty in connecting with the right services, inefficient communication, and lack of transparency in service availability, costs, and timelines.
- **For Healthcare Enterprises**: Resource management bottlenecks, operational gaps, and inconsistent communication between organizations, leading to inefficiencies and reduced accountability.

### **Solution**
MediLink addresses these challenges by providing a seamless, integrated platform that connects healthcare stakeholders and optimizes their interactions.

### **Technologies Used**
- Java Swing (for the user interface)
- Backend: Java

### **System Architecture**
MediLink is designed with a modular architecture, featuring various components for:
- **Healthcare Providers**
- **Ambulance Services**
- **Diagnostics**
- **Pharmacy Operations**

These components interact through a secure, centralized platform that ensures efficient operations across enterprises.

### **Use Cases**
- **Patient Journey**: 
    1. Patient requests ambulance.
    2. Ambulance is dispatched and transports the patient.
    3. Patient is registered at the hospital.
    4. Doctor diagnoses and refers to diagnostics.
    5. Lab testing is conducted, results reviewed, and medications dispensed.
    
- **Enterprise Interactions**: 
    1. Diagnostics Admin coordinates with vendors.
    2. Pharmaceutical Admin liaises with manufacturers.
    3. System Admin ensures security and data exchange across enterprises.

### **Installation**
To run MediLink locally, follow these steps:

1. Clone the repository:
    ```bash
    git clone https://github.com/saharediksha/INFO5100_Final_Project.git
    ```

2. Navigate to the project directory:
    ```bash
    cd medilink
    ```

3. Compile and run the Java Swing application:
    ```bash
    javac -d bin src/*.java
    java -cp bin MediLinkApp
    ```

4. Set up the database (example using MySQL):
    - Create a new database `medilink`.
    - Run the SQL scripts provided in the `db/` folder to set up tables and initial data.

### **Contribution**
We welcome contributions to improve MediLink. If you would like to contribute, please:
- Fork the repository.
- Create a new branch (`git checkout -b feature-branch`).
- Commit your changes (`git commit -am 'Add new feature'`).
- Push to the branch (`git push origin feature-branch`).
- Submit a pull request.

### **License**
This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

### **Contact**
For any questions or feedback, feel free to contact us:
- **Aditya Pimpalkar**: pimpalkar.a@northeastern.edu
- **Diksha Sahare**: sahare.d@northeastern.edu
- **Komal Khairnar**: khairnar.ko@northeastern.edu

---

Thank you for exploring MediLink!
