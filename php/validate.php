<?php
$string = "ê¹€ì§€ì›";
$safeString = filter_var(
    $string,
    FILTER_SANITIZE_STRING,
    FILTER_FLAG_STRIP_LOW|FILTER_FLAG_ENCODE_HIGH
);
echo $safeString . PHP_EOL;


$email = 'jhon@examp,,,le.com';
$emailSafe = filter_var($email, FILTER_SANITIZE_EMAIL);
echo $emailSafe . PHP_EOL;


$isEmail = filter_var($email, FILTER_VALIDATE_EMAIL);
if ($isEmail !== false) {
    echo '성공';
} else {
    echo '실패';
}

$output = '<p><script>alert("NAS 백도어가 설치되었습니다.");</script></p>';
echo htmlentities($output, ENT_QUOTES, 'UTF-8');