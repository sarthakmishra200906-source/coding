<?php
function renderResultPage(string $message, bool $isSuccess): void
{
    $safeMessage = htmlspecialchars($message, ENT_QUOTES, 'UTF-8');
    $messageColor = $isSuccess ? '#1b8f2e' : '#b00020';

    echo '<!DOCTYPE html>';
    echo '<html lang="en">';
    echo '<head>';
    echo '    <meta charset="UTF-8">';
    echo '    <meta name="viewport" content="width=device-width, initial-scale=1.0">';
    echo '    <title>Travel Form Status</title>';
    echo '    <style>';
    echo '        * { box-sizing: border-box; margin: 0; padding: 0; }';
    echo '        body { min-height: 100vh; display: grid; place-items: center; font-family: Arial, sans-serif; background: #f4f7fb; padding: 24px; }';
    echo '        .card { background: #fff; padding: 32px 28px; border-radius: 14px; box-shadow: 0 10px 30px rgba(0,0,0,.12); max-width: 560px; width: 100%; text-align: center; }';
    echo '        .message { color: ' . $messageColor . '; font-size: 22px; line-height: 1.5; font-weight: 700; margin-bottom: 20px; }';
    echo '        .btn { display: inline-block; background: #24adc6; color: #fff; text-decoration: none; padding: 12px 20px; border-radius: 10px; font-weight: 700; }';
    echo '    </style>';
    echo '</head>';
    echo '<body>';
    echo '    <div class="card">';
    echo '        <div class="message">' . $safeMessage . '</div>';
    echo '        <a class="btn" href="index.html">Enter a new data</a>';
    echo '    </div>';
    echo '</body>';
    echo '</html>';
    exit;
}

$server = "127.0.0.1";
$port = 3307;
$username = "root";
$password = "";
$database = "trip";

mysqli_report(MYSQLI_REPORT_ERROR | MYSQLI_REPORT_STRICT);

try {
    $con = mysqli_connect($server, $username, $password, $database, $port);
} catch (mysqli_sql_exception $exception) {
    renderResultPage("connection to this database failed due to " . $exception->getMessage(), false);
}

if ($_SERVER["REQUEST_METHOD"] === "POST") {
    $name = trim($_POST["name"] ?? "");
    $age = trim($_POST["age"] ?? "");
    $gender = trim($_POST["gender"] ?? "");
    $email = trim($_POST["email"] ?? "");
    $phone = trim($_POST["phone"] ?? "");
    $other = trim($_POST["other"] ?? ($_POST["desc"] ?? ""));

    try {
        $stmt = mysqli_prepare(
            $con,
            "INSERT INTO `trip` (`name`, `age`, `gender`, `email`, `phone`, `other`, `dt`) VALUES (?, ?, ?, ?, ?, ?, current_timestamp())"
        );

        mysqli_stmt_bind_param($stmt, "ssssss", $name, $age, $gender, $email, $phone, $other);
        mysqli_stmt_execute($stmt);
        mysqli_stmt_close($stmt);
        mysqli_close($con);
        renderResultPage("thanks for your intrest we are happy to se you on trip joining for the benrs trip", true);
    } catch (mysqli_sql_exception $exception) {
        if (isset($stmt) && $stmt instanceof mysqli_stmt) {
            mysqli_stmt_close($stmt);
        }
        mysqli_close($con);
        renderResultPage("Error submitting data: " . $exception->getMessage(), false);
    }
}

mysqli_close($con);
?>