const containers = document.querySelectorAll(".panel");

containers.forEach((container) => {
  container.addEventListener("click", () => {
    removeActiveClasses();
    container.classList.add("active");
  });
});

const removeActiveClasses = () => {
  containers.forEach((c) => {
    c.classList.remove("active");
  });
};
