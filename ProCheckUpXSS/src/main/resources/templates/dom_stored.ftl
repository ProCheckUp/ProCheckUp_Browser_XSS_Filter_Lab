<#include "/common/header.ftl">

<body onload="load_name()">

<#include "/common/nav.ftl">

    <div class="container">

        <h3 id="result"></h3>

        <label>Name: </label><input type="text" name="name" id="name">
        <button onclick="stored_dom()">Send</button>

        <script>
        function stored_dom(){
            // Check browser support
            if (typeof(Storage) !== "undefined") {

                var name = document.getElementById("name").value;
                // Store
                localStorage.setItem("name", name);
                // Retrieve
                document.getElementById("result").innerHTML = "Hello " + localStorage.getItem("name");
            }
        }

        function load_name(){
            
            if (localStorage.hasOwnProperty("name")){
                document.getElementById("result").innerHTML = "Hello " + localStorage.getItem("name");
            }
        }

        </script>

    </div>
</body>
</html>