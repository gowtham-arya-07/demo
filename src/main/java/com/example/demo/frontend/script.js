const API = "http://localhost:8080";

async function getScore() {

    const response =
        await fetch(`${API}/score`);

    const data = await response.json();

    updateUI(data);
}

async function addRuns(run) {

    const response =
        await fetch(`${API}/runs/${run}`, {

            method: "POST"
        });

    const data = await response.json();

    updateUI(data);
}

async function addWicket() {

    const response =
        await fetch(`${API}/wicket`, {

            method: "POST"
        });

    const data = await response.json();

    updateUI(data);
}

function updateUI(data) {

    document.getElementById("runs")
        .innerText = data.runs;

    document.getElementById("wickets")
        .innerText = data.wickets;

    document.getElementById("overs")
        .innerText = data.overs;
}

getScore();