$(document).ready(function () {
    $("#myTab li:eq(0) a").tab('show');
    $imgSrc = $('#imgProfile').attr('src');
    function readURL(input) {

        if (input.files && input.files[0]) {
            var reader = new FileReader();

            reader.onload = function (e) {
                $('#imgProfile').attr('src', e.target.result);
            };

            reader.readAsDataURL(input.files[0]);
        }
    }
    $('#btnChangePicture').on('click', function () {
        if (!$('#btnChangePicture').hasClass('changing')) {
            $('#profilePicture').click();
        }
        else {
            $('#profilePicture').click();
        }
    });
    $('#profilePicture').on('change', function () {
        readURL(this);
        $('#btnChangePicture').addClass('changing');
        $('#btnChangePicture').attr('value', 'Change');
        $('#btnDiscard').removeClass('d-none');
    });
    $('#btnDiscard').on('click', function () {
        $('#btnChangePicture').removeClass('changing');
        $('#btnChangePicture').attr('value', 'Change');
        $('#btnDiscard').addClass('d-none');
        $('#imgProfile').attr('src', $imgSrc);
        $('#profilePicture').val('');
    });
});
