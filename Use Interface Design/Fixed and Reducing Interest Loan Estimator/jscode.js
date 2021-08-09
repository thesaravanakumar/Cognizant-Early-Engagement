const _principalAmount = document.getElementById("principalAmount");
const _interestRateYear = document.getElementById("interestRate");
const _tenureMonth = document.getElementById("tenure");

function getEmiReducing(P, N, R) {
    return (P * R * (Math.pow((1 + R), N) / (Math.pow((1 + R), N) - 1)));
}

function EstimateReducingInterestLoan() {
    calculateEMI();
    totalPayment();
    totalInterest();
    EstimateFixedInterestLoan();
}

function EstimateFixedInterestLoan() {
    const principalAmount = Number(_principalAmount.value);
    const interestRateYear = Number(_interestRateYear.value);
    const tenureMonth = Number(_tenureMonth.value);

    const totalInterestFixed = principalAmount * interestRateYear * tenureMonth / 1200;
    const totalPaymentFixed = principalAmount + totalInterestFixed;
    const emiFixed = totalPaymentFixed / tenureMonth;

    document.getElementById("tInterestFixed").innerHTML = Number(totalInterestFixed).toFixed(2).toString();
    document.getElementById("tPaymentFixed").innerHTML = Number(totalPaymentFixed).toFixed(2).toString();
    document.getElementById("EMIFixed").innerHTML = Number(emiFixed).toFixed(2).toString();
}

function reducingLoan() {
    const principalAmount = Number(_principalAmount.value);
    const interestRateYear = Number(_interestRateYear.value);
    const interestRateMonth = Number(interestRateYear / 1200);
    const tenureMonth = Number(_tenureMonth.value);

    const emiReducing = getEmiReducing(principalAmount, tenureMonth, interestRateMonth);
    const totalPaymentReducing = tenureMonth * emiReducing;
    const totalInterestReducing = totalPaymentReducing - principalAmount;

    return {
        emiReducing: emiReducing,
        totalPaymentReducing: totalPaymentReducing,
        totalInterestReducing: totalInterestReducing
    };
}

function calculateEMI() {
    const emiReducing = reducingLoan().emiReducing;
    document.getElementById("EMI").innerHTML = Number(emiReducing).toFixed(2).toString();
}

function totalPayment() {
    const totalPaymentReducing = reducingLoan().totalPaymentReducing;
    document.getElementById("tPayment").innerHTML = Number(totalPaymentReducing).toFixed(2).toString();
}

function totalInterest() {
    const totalInterestReducing = reducingLoan().totalInterestReducing;
    document.getElementById("tInterest").innerText = Number(totalInterestReducing).toFixed(2).toString();
}