package com.example.tasktable;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class CustomersVievServlet extends HttpServlet {

    private List<Customer> customers
            = Arrays.asList(new Customer("Midi tower","Intel","i3 12100f","Gigabyte Gaming OC",3060,32,"HyperX","DDR4","Asus","B660","Asus","Logi","HyperX","HyperX","Lorgar","IKEA","Hator","Marshall"),
            new Customer("Full tower","Intel","i5 12400f","Asus TUF",3050,32,"GoodRam","DDR5","AsRock","B660","Samsung","Razer","HyperX","Razer","HyperX","IKEA","Anda Seat","Marshall"),
            new Customer("Mini tower","Amd","Ryzen 9 7900","Gigabyte Gaming OC",3050,32,"GoodRam","DDR5","AsRock","B560","Samsung","Razer","Razer","Razer","HyperX","IKEA","Anda Seat","Sony"),
            new Customer("Full tower","Intel","i5 12400k","Inno3DC",3070,16,"HyperX","DDR4","Asus","B760","Samsung","Razer","HyperX","Razer","HyperX","IKEA","Anda Seat","Marshall"),
            new Customer("Full tower","Amd","Ryzen 5 7600","Gigabyte Gaming OC",3050,16,"G.Skill","DDR4","AsRock","B560","Samsung","Razer","Razer","Razer","HyperX","IKEA","Anda Seat","Sony"),
            new Customer("Mini tower","Intel","i7 13700","Asus TUF",3070,32,"GoodRam","DDR4","Asus","B760","Samsung","Logi","HyperX","Razer","Razer","IKEA","Hator","Marshall"),
            new Customer("Full tower","Intel","i5 12400","Gigabyte Gaming OC",3050,32,"GoodRam","DDR5","Gigabyte","B760","Asus","Logi","Razer","HyperX","Lorgar","IKEA","Hator","Sony"),
            new Customer("Midi tower","Intel","i5 12400kf","Inno3D",3070,16,"G.Skill","DDR4","AsRock","B660","Samsung","Razer","Razer","Razer","Razer","IKEA","Anda Seat","Marshall"),
            new Customer("Full tower","Amd","Ryzen 7 7700X","Gigabyte Gaming OC",3050,16,"HyperX","DDR4","Asus","B560","Samsung","Logi","HyperX","HyperX","HyperX","IKEA","Anda Seat","Marshall"),
            new Customer("Mini tower","Intel","i5 13400f","Asus TUF",3070,32,"GoodRam","DDR4","AsRock","B760","Samsung","Razer","HyperX","Razer","HyperX","IKEA","Hator","Sony"),
            new Customer("Full tower","Intel","i5 13600kf","Inno3D",3050,32,"G.Skill","DDR5","AsRock","B660","Asus","Razer","Razer","HyperX","Lorgar","IKEA","Anda Seat","Marshall"),
            new Customer("Full tower","Amd","Ryzen 5 7600X","Gigabyte Gaming OC",3050,32,"HyperX","DDR4","AsRock","B560","Samsung","Logi","HyperX","Razer","HyperX","IKEA","Hator","Sony"),
            new Customer("Mini tower","Intel","i5 13500","Asus TUF",3070,16,"G.Skill","DDR4","Gigabyte","B660","Asus","Logi","Razer","HyperX","HyperX","IKEA","Hator","Marshall"),
            new Customer("Micro tower","Intel","i7 13700f","Inno3D",3080,32,"GoodRam","DDR4","AsRock","B760","Samsung","Razer","HyperX","Razer","Razer","IKEA","Anda Seat","Marshall"),
            new Customer("Full tower","Amd","Ryzen 7 7700","Gigabyte Gaming OC",3080,16,"G.Skill","DDR5","Asus","B560","Asus","Logi","Razer","Razer","HyperX","IKEA","Anda Seat","Sony")
    );

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("customersList", customers);
        request.setAttribute("customers", getCustomerTable());
    request.getRequestDispatcher("/customers.jsp").forward(request,response);
    }

    public String getCustomerTable(){
        StringBuilder sb=new StringBuilder();
        for (Customer customer: customers){
            sb.append("<tr><td class=number")
                    .append(customer.getComputerCase())
                    .append("</td><td>")
                    .append(customer.getCpuBrand())
                    .append("</td><td>")
                    .append(customer.getCpuCore())
                    .append("</td><td>")
                    .append(customer.getGpuBrand())
                    .append("</td><td>")
                    .append(customer.getGpuGenerate())
                    .append("</td><td>")
                    .append(customer.getRam())
                    .append("</td><td>")
                    .append(customer.getRamBrand())
                    .append("</td><td>")
                    .append(customer.getRamGenerate())
                    .append("</td><td>")
                    .append(customer.getMotherboardBrand())
                    .append("</td><td>")
                    .append(customer.getMotherboardChipset())
                    .append("</td><td>")
                    .append(customer.getMonitorBrand())
                    .append("</td><td>")
                    .append(customer.getWebCamBrand())
                    .append("</td><td>")
                    .append(customer.getMouseBrand())
                    .append("</td><td>")
                    .append(customer.getKeyboardBrand())
                    .append("</td><td>")
                    .append(customer.getMicrophoneBrand())
                    .append("</td><td>")
                    .append(customer.getTableBrand())
                    .append("</td><td>")
                    .append(customer.getChairBrand())
                    .append("</td><td>");
        }
        return sb.toString();
    }

}
