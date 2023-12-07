const faqs = document.querySelectorAll('.faqs');

faqs.forEach( faq => {
    const question = faq.querySelector(".question");
    const answer = faq.querySelector(".answer");
    const minusIcon = faq.querySelector(".minus-icon");

    question.addEventListener("click", () => {
        const isOpen = answer.style.maxHeight !== "0px"; 
        
        if (isOpen) {
            answer.style.maxHeight = "0px";
            minusIcon.style.maxHeight= "0px";
        }
        else {
            answer.style.maxHeight = "300px";
            minusIcon.style.maxHeight= "30px";
        }
    });
});

