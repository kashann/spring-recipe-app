const deleteButtons = document.getElementsByClassName('confirmation');

var confirmation = function (e) {
    if (!confirm('Are you sure?')) e.preventDefault();
};

for (var i = 0, l = deleteButtons.length; i < l; i++) {
    deleteButtons[i].addEventListener('click', confirmation, false);
}