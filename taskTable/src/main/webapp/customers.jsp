<%@ page import="java.util.List" %>
<%@ page import="com.example.tasktable.Customer" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link href="css/style.css" rel="stylesheet">
    <title>Table PC</title>
</head>
<body>
<table>
    <thead>
    <tr>
        <th>Case</th>
        <th>Cpu brand</th>
        <th>Cpu Core</th>
        <th>Gpu Brand</th>
        <th>Gpu Generate</th>
        <th>Ram</th>
        <th>Ram Brand</th>
        <th>Ram Generate</th>
        <th>Motherboard Brand</th>
        <th>Motherboard Chipset</th>
        <th>Monitor Brand</th>
        <th>Web Cam Brand</th>
        <th>Mouse Brand</th>
        <th>Keyboard Brand</th>
        <th>Microphone Brand</th>
        <th>Table Brand</th>
        <th>Chair Brand</th>
        <th>Sound Speaker Brand</th>
    </tr>
    </thead>
    <tbody>
    <%
        List<Customer> customers = (List<Customer>) request.getAttribute("customersList");
        for (Customer customer : customers) {
            out.print("<tr><td class=number>" + customer.getComputerCase() + "</td><td>" +
                    customer.getCpuBrand() + "</td><td>" + customer.getCpuCore() + "</td><td>" +
                    customer.getGpuBrand() + "</td><td>" + customer.getGpuGenerate() + "</td><td>" +
                    customer.getRam() + "</td><td>" + customer.getRamBrand() + "</td><td>" +
                    customer.getRamGenerate() + "</td><td>" + customer.getMotherboardBrand() +
                    "</td><td>" + customer.getMotherboardChipset() + "</td><td>" +
                    customer.getMonitorBrand() + "</td><td>" + customer.getWebCamBrand() +
                    "</td><td>" + customer.getMouseBrand() + "</td><td>" +
                    customer.getKeyboardBrand() + "</td><td>" + customer.getMicrophoneBrand() +
                    "</td><td>" + customer.getTableBrand() + "</td><td>" +
                    customer.getChairBrand() + "</td><td>" + customer.getSoundSpeakerBrand() + "</td></tr>");
        }
    %>
    </tbody>
</table>
</body>
</html>
