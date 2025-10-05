<!DOCTYPE html>
<html>
<head>
  <title>$.ajax Example</title>
  <script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
</head>
<body>

  <button id="fetchBtn">Fetch Data</button>
  <div id="output"></div>

  <script>
    $("#fetchBtn").click(function() {
      $.ajax({
        url: "data.json",       // File or API endpoint
        method: "GET",          // or "POST"
        dataType: "json",       // expected response type
        success: function(res) { // success callback
          $("#output").html(`
            <h3>${res.name}</h3>
            <p>Age: ${res.age}</p>
            <p>City: ${res.city}</p>
          `);
        },
        error: function(err) {   // error callback
          console.error("Error fetching data:", err);
        },
        complete: function() {   // always runs
          console.log("Request completed");
        }
      });
    });
  </script>

</body>
</html>
